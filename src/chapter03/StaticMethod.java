package chapter03;

public class StaticMethod {
	int n;
	static int m;
	
	// 인스탄스 메소드에서는 인스탄스 변수에 접근 가능
	int f1() {
		return n;
	}
	
	// 인스탄스 메소드에서는 클래스(static) 변수에 접근 가능
	int f2() {
		// return StaticMethod.m;
		return m;
	}
	
	// 클래스(static) 메소드에서는 인스탄스 변수에 접근 불가능
	static int s1() {
		//return n;
		return 0;
	}
	
	// 클래스(static) 메소드에서는 클래스(static) 변수에 접근 불가능
	static int s2() {
		// return StaticMethod.m;
		return m;
	}
	
	// 클래스(static) 메소드에서는 클래스(static) 메소드에 접근 가능
	static int s3() {
		return s2();
	}

	// 클래스(static) 메소드에서는 인스탄스 메소드에 접근 불가능
	static int s4() {
		//return f1();
		return 0;
	}
}
