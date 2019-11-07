package chapter01;

import java.util.Scanner;

public class SumInput01 {

	public static void main(String[] args) {

		
		System.out.print("수를 입력하세요 : ");

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(); // 입력받기(입력받기전까지 blocking됨)
		scanner.close();
		
		int sum = 0;		
		int i = 1;
		while(i <= number)
			sum = sum + i++;
		
		System.out.println("1에서 " + number + "까지의 합은 " + sum + "입니다.");
	}

}
