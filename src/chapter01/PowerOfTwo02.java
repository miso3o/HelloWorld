package chapter01;

import java.util.Scanner;

public class PowerOfTwo02 {

	public static void main(String[] args) {
		
		System.out.print("수를 입력하세요 : ");

		Scanner scanner = new Scanner(System.in);
		int power = scanner.nextInt(); // 입력받기(입력받기전까지 blocking됨)
		scanner.close();
		
		long result = 1;
	
		for (int i = 1; i <= power ; i++)
			result = result * 2;

		System.out.println("2의 " + power + "제곱은 " + result +"입니다.");
	}

}
