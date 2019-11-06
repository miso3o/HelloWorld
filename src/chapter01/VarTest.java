package chapter01;

public class VarTest {

	public static void main(String[] args) {
		/*
		 * 기본 타입(Primitive Type 8)
		 */
		
		//정수
		byte b = 1;
		short s = 10;
		int i = 2000;
		long l = 1234567890L;  // 기이이인 정수임을 L로 표기
		
		//실수
		float f = 3.14f;  // 실수임을 f로 표기
		double d = 3.14;
		
		// 문자
		char c = 'A';
		char c2 = 65;
		
		// 불린
		boolean bool = true;
		boolean bool2 = false;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(c2);
		System.out.println(bool);
		System.out.println(bool2);
		
		/*
		 *  참조형(reference type)
		 */
		// 문자열은 기본타입이 아니다.
		// 문자열은 기본타입 char가 모여 있는  String 클래스의 객체다.
		String str = "hello";
		System.out.println(str.length());

		/*
		 * 지역 변수 초기화 
		 */
		// 지역변수는 초기화가 되어야 한다.
		// 안되어 있는 상태로 사용하면 오류.
		int j = 0;
		
		System.out.println(j);
		
		/*
		 * 상수
		 */
		final int NUMBER = 10;
		System.out.println(NUMBER);
		// 오류
		// 초기화할 때 final이 붙어 있는 변수는 
		// 최기화 이후 부터는 값을 대입할 수 없다. 
		// number = 100;
	}

}
