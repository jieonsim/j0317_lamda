package lamda;

// 람다식을 이용하여 제곱근을 구하시오
@FunctionalInterface
interface MyFunc6_2 {
	int calc(int x);
}

// 람다식을 이용하여 원넓이 구하시오
@FunctionalInterface
interface MyFunc6_2_2 {
	int calc(int r);
}

//람다식을 이용하여 원넓이 구하시오
@FunctionalInterface
interface MyFunc6_2_3 {
	double calc(int r);
}

public class Test06_2 {
	public static void main(String[] args) {
//		MyFunc6_3 myFunc6 = new MyFunc6_3() {
//
//			@Override
//			public int calc(int x) {
//				return x * x;
//			}
//		};

		MyFunc6_2 myFunc6_2 = (x) -> x * x;
		System.out.println("5의 거듭 제곱 : " + myFunc6_2.calc(5));

		MyFunc6_2_2 myFunc6_2_2 = (r) -> (int) (r * r * 3.14); // 실수를 정수형으로 강제 형반환
		System.out.println("반지름 5인 원넓이 : " + myFunc6_2_2.calc(5));
		System.out.println("반지름 10인 원넓이 : " + myFunc6_2_2.calc(10));

		MyFunc6_2_3 myFunc6_2_3 = (r) -> r * r * Math.PI;
		System.out.println("반지름 5인 원넓이 : " + myFunc6_2_3.calc(5));
		System.out.println("반지름 10인 원넓이 : " + myFunc6_2_3.calc(10));
	}
}
