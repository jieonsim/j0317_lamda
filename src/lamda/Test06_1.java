package lamda;

// 람다식을 이용하여 제곱근을 구하시오

@FunctionalInterface
interface MyFunc6_1 {
	int calc(int x);
}

public class Test06_1 {
	public static void main(String[] args) {
//		MyFunc6_2 myFunc6_2 = new MyFunc6_2() {
//
//			@Override
//			public int calc(int x) {
//				return x * x;
//			}
//		};
		
		MyFunc6_1 myFunc6_1 = (x) -> x * x;

		System.out.println("5의 거듭 제곱 : " + myFunc6_1.calc(5));
	}
}
