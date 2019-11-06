package chapter01;

public class Arith {

	public static void main(String[] args) {

		//////////// 산술연산(이항연산자) ////////////
		int a = 3;
		int b = 7;
		
		int r1 = a + b;
		int r2 = a - b;
		int r3 = a * b;
		int r4 = a / b;  // 나누기 연산 (나머지 없이 몫)
		int r5 = a % b;  // 나머지 연산 (몫말고 나머지)
		
		System.out.println("a + b = " + r1);
		System.out.println("a - b = " + r2);
		System.out.println("a * b = " + r3);
		System.out.println("a / b = " + r4);
		System.out.println("a % b = " + r5);
		
		System.out.println("10 / 3 = " + 10/3);		// int op int => int
		System.out.println("10 / 3 = " + 10/3.);	// int op double => double
		
		// 주의(연산순서)
		System.out.println("10 / 3 = " + (double)10/3); 
		System.out.println("10 / 3 = " + (double)(10/3));
		
		
		
		//////////// 증감연산자(단항연산자)  ////////////
		int n = 1;
		
		// 전위 증감연산자
		n++; 		// n = n + 1;
		System.out.println("n++ : " + n);
		n--;    	// n = n - 1;
		System.out.println("n-- : " + n);
		
		// 후위 증감연산자
		++n;
		System.out.println("++n : " + n);
		--n;
		System.out.println("--n : " + n);

		// 참고(산술연산자는 다음과 같이 축약형으로 사용할 수 있다)
		n+=10; 		// n = n + 10;
		System.out.println("n+=10 : " + n);
		n-=10;		// n = n - 10;
		System.out.println("n-=10 : " + n);
		n*=10;		// n = n * 10;
		System.out.println("n*=10 : " + n);

		

	}

}
