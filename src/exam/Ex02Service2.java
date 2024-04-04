package exam;

import java.util.ArrayList;
import java.util.List;

//람다식을 위한 인터페이스
@FunctionalInterface
interface Calculate {
	int apply(int korean, int english, int math);
}

public class Ex02Service2 {
	private List<Ex02VO> studentList = new ArrayList<>();

	public void addStudent(String name, int korean, int english, int math) {
		Ex02VO student = new Ex02VO();
		student.setName(name);
		student.setKorean(korean);
		student.setEnglish(english);
		student.setMath(math);

		// 람다식을 이용한 총점과 평균 계산
		Calculate totalCalc = (ko, en, ma) -> ko + en + ma;
		Calculate averageCalc = (ko, en, ma) -> (ko + en + ma) / 3;

		// 람다식 적용
		int total = totalCalc.apply(korean, english, math);
		double average = averageCalc.apply(korean, english, math);

		// 총점, 평균, 학점 설정
		student.setTotal(total);
		student.setAverage(average);
		student.setGrade(calculateGrade(average));

		// 리스트에 학생 정보 추가
		studentList.add(student);
	}

	// 학점 계산 메소드
	private char calculateGrade(double average) {
		if (average >= 90)
			return 'A';
		else if (average >= 80)
			return 'B';
		else if (average >= 70)
			return 'C';
		else if (average >= 60)
			return 'D';
		else
			return 'F';
	}

	// 학생 성적 출력 메소드
	public void printGrades() {
		System.out.println("\n\t성 적 표");
		System.out.println("====================================================");
		System.out.println("번호\t이름\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\t\t\t학점");
		System.out.println("------------------------------------------------------------------------------------------");

		for (int i = 0; i < studentList.size(); i++) {
			Ex02VO vo = studentList.get(i);
			System.out.print(" " + (i + 1) + "\t");
			System.out.print(vo.getName() + "\t\t");
			System.out.print(vo.getKorean() + "\t\t");
			System.out.print(vo.getEnglish() + "\t\t");
			System.out.print(vo.getMath() + "\t\t");
			System.out.print(vo.getTotal() + "\t\t");
			System.out.print(String.format("%.1f", vo.getAverage()) + "\t\t\t");
			System.out.print(vo.getGrade() + "\n");
		}
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("====================================================");
	}
}


