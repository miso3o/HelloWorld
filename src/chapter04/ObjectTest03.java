package chapter04;

import java.util.HashSet;
import java.util.Set;

public class ObjectTest03 {
	
	public static void main(String[] args) {

		Set<Rect> set = new HashSet<>();
				
		Rect r1 = new Rect(10,20);
		System.out.println(r1);
		set.add(r1);
		
		Rect r2 = new Rect(10,20);
		System.out.println(r1.equals(r2));
		set.add(r2);
		
		System.out.println(set);
		System.out.println(set.size());


	}

}
