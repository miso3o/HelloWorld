package chapter04;

public class WrapperClass01 {

	public static void main(String[] args) {

		Integer i = new Integer(1);
		Character c = new Character('A');
		Boolean b = new Boolean(true);
		
		System.out.println(i);
		System.out.println(c);
		System.out.println(b);
		
		System.out.println("-------------------");
		
		// Auto Boxing
		Integer i2 = 10;
		Integer i3 = 10;
		System.out.println(i2 == i3);
		
		System.out.println("-------------------");
		
		// Auto Unboxing
		int j1 = 20 + i2.intValue();
		int j2 = 20 + i2;  	// Auto Unboxing이 안되면 안돼는 코드이다.
		
		System.out.println(j1 == j2);
		
		
	}

}
