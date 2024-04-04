package lamda;

// 람다식을 구현하기 위해서는 '함수형(적) 인터페이스'를 생성해준다.
// 함수형 인터페이스 : 추상 메소드가 단 1개인 인터페이스이다.

@FunctionalInterface
interface Myfunc4 {
	int add(int x, int y);
}

public class Test04 {
	public static void main(String[] args) {
		Myfunc4 myfunc4 = new Myfunc4() {
			
			@Override
			public int add(int x, int y) {
				return x + y;
			}
		};
		
		int res = myfunc4.add(40, 50);
		System.out.println("res : " + res);
	}
}
