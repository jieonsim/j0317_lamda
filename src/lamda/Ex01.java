package lamda;

// 람다식을 이용하여 입력받은 수들 중에서 최대/최소값을 구하시오.
@FunctionalInterface
interface ExFunc01 {
	int[] calc(int[] su);

}

public class Ex01 {
	public static void main(String[] args) {

		ExFunc01 exFunc01 = (su) -> {
			int max = su[0], min = su[0];
			for (int i = 1; i < su.length; i++) {
				if (su[i] > max) {
					max = su[i];
				} else if (su[i] < min) {
					min = su[i];
				}
			}
			int[] res = new int[2];
			res[0] = max;
			res[1] = min;
			
			return res;
			// 람다식 여러줄 쓸 경우 retrun 해줘야함
			// return 넘기는 값은 무조건 하나만 넘길 수 있음
			// 여러개를 넘기도록 배열을 이용함
		};
		// 처리 루틴
		int[] su = { 10, 5, 15, 2, 8, 20, 7, 16, 9, 13 };

		int[] res = exFunc01.calc(su);
		System.out.println("최대값 : " + res[0]);
		System.out.println("최소값 : " + res[1]);
	}
}
