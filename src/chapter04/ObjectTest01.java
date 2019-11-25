package chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {

		Point p = new Point(10, 20);
		
		System.out.println(p.getClass());  // Reflection
		
		System.out.println(p.hashCode());  // Reference Value   (x)
										   // address			(x)
										   // address기반의 해싱값	(o)
		System.out.println(p);
		System.out.println(p.toString());  // getClass() + "@" + hashCode()
										   // = 클래스        + "@" + 해싱값
	}

}
