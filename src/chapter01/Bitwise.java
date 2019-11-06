package chapter01;

public class Bitwise {

	public static void main(String[] args) {

		//////////  비트연산 Bitwise  //////////
		// 7 : 0000 0111
		// 4 : 0000 0100
		
		// 7 & 4  : 0000 0111 * 0000 0100 = 0000 0100 -> 4
		// 7 | 4  : 0000 0111 + 0000 0100 = 0000 0111 -> 7
		// 7 >> 3 : 0000 0000
		// 7 << 3 : 0011 1000 -> 2^3 + 2^4 + 2^5 = 8+16+32 = 56
		
		System.out.println(7 & 4); // 각 자리 논리곱을 확인한다
		System.out.println(7 | 4); // 각 자리 논리합을 확인한다
		System.out.println(7 >>3);
		System.out.println(7 <<3);
		
	}

}
