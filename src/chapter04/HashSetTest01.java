package chapter04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest01 {

	public static void main(String[] args) {

		Set<String> s = new HashSet<>();
		
		String s1 = new String("고길동");
		String s2 = new String("고길동");
		
		s.add("둘리");
		s.add("마이콜");
		s.add(s1);  
		// s.add(s2);   // 객체의 동일성이 아닌 내용의 동일성을 기준으로 중복확인하여 같은건 안들어감.
		
		System.out.println(s.contains("둘리"));
		System.out.println(s.size());
		System.out.println(s.contains(s2));   // 객체의 동일성이 아닌 내용의 동일성을 기준으로 확인하므로 True로 결과나옴
		
		
		System.out.println(s.remove(s2));   // 객체의 동일성이 아닌 내용의 동일성을 기준으로 제거하므로 이후 사이즈가 2로 줄어듬
		System.out.println(s.size());
		
		// 순회
		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
	}

}
