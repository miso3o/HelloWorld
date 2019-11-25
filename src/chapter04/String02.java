package chapter04;

public class String02 {
	
	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;
		
		s2 = s1.toUpperCase();
		
		String s4 = s3.concat("??");
		String s5 = "!".concat(s2).concat("@");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		// equals를 할 때 주의해야 할 점
		String s = null;
		System.out.println(equalsHello("Hello"));
		
		
		
		// 주의 : +연산자로 문자열(String)을 더할때
		String str2 = "";
		StringBuffer sb2 = new StringBuffer("");
		
		for (int i = 0; i<10000; i++)
		{
			str2 = str2 + i ; // => str2 = new StringBuffer(str2).append(i);
			sb2.append(i);
		}
		
		// format
		String name = "둘리";
		int score = 100;
		
		System.out.println(name + "님의 점수는 " + score + "입니다.");
		
		String str3 = String.format("%s님의 점수는 %d입니다.", name, score);
		System.out.println(str3);
		
		
		
		
		
		
	}
	
	private static boolean equalsHello(String s)
	{
		//return s.contentEquals("Hello");
		return "Hello".equals(s);
	}
}
