package lamda;

// 람다식을 구현하기 위해서는 '함수형(적) 인터페이스'를 생성해준다.
// 함수형 인터페이스 : 추상 메소드가 단 1개인 인터페이스이다.

@FunctionalInterface
interface Myfunc2 {
	int add(int x, int y);
}

public class Test02 {
	public Test02(int x, int y) {
		Myfunc2 myfunc2 = new Myfunc2() {

			@Override
			public int add(int x, int y) {
				return x + y;
			}
		};

		int res = myfunc2.add(x, y);
		System.out.println("res : " + res);
	}
	
	public static void main(String[] args) {
		new Test02(20, 30);
	}
}
