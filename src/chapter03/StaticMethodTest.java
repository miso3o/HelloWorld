package chapter03;

public class StaticMethodTest {
	public static void main(String[] args) {
		
		MyNumber n = new MyNumber();
		n.setValue(-10);
		System.out.println(n.abs());

		//MyNumber n2 = new MyNumber();
		System.out.println(MyNumber.abs(-10));
		System.out.println(MyNumber.max(10, 20));
		
		String sn = "1234";
		int n2 = Integer.parseInt(sn);
		
		int n3 = 5678;
		String sn2 = String.valueOf(n3);
		
		System.out.println(Math.PI);
	}
}
