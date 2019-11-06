package chapter01;

public class Logical {

	public static void main(String[] args) {

		////////// 논리연산자  //////////
		// 논리연산자(이항연산자)
		// 각 항이 true, false의 변수나 연산이어야 한다.
		
		int a = 7;
		int b = 3;
		
		// || : or(논리합) 둘중 하나라도 true라면 true
		// true  || true  -> 1 + 1 -> 2 -> true
		// true  || false -> 1 + 0 -> 1 -> true
		// false || true  -> 0 + 1 -> 1 -> true
		// false || false -> 0 + 0 -> 0 -> false
		boolean r1 = (a > b) || (b != a);
		System.out.println(r1);
		
		// && : and(논리곱) 둘중 하나라도 false라면 false
		// true  && true  -> 1 * 1 -> 1 -> true
		// true  && false -> 1 * 0 -> 0 -> false
		// false && true  -> 0 * 1 -> 0 -> false
		// false && false -> 0 * 0 -> 0 -> false
		boolean r2 = (a < b) && (b != a);
		System.out.println(r2);
		
		System.out.println((a==b)||(a>b));
		System.out.println((a==b)&&(a>b)); 		
		System.out.println((a!=b)||(a>b));
		System.out.println((a!=b)&&(a>b));
		
		// ! : not 단항연산자로 연산결과의 반대
		System.out.println(!(a < b));


	}

}
