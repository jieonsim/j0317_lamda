package lamda;

// 람다식을 구현하기 위해서는 '함수형(적) 인터페이스'를 생성해준다.
// 함수형 인터페이스 : 추상 메소드가 단 1개인 인터페이스이다.

@FunctionalInterface
interface Myfunc3 {
	int add(int x, int y);
}

public class Test03 {
	public static void main(String[] args) {
		Myfunc3 myfunc3 = new Myfunc3() {

			@Override
			public int add(int x, int y) {
				return x + y;
			}
		};
		
		int res = myfunc3.add(10, 20);
		System.out.println("res : " + res);
	}
}
