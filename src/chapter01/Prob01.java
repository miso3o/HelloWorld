package chapter01;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {

		System.out.println("수를 입력하세요 : ");

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(); // 입력받기(입력받기전까지 blocking됨)
		
		
		if((number%3) == 0)
		{
			System.out.println(number + "는 3의 배수이며, ");
		}
		else 
		{
			System.out.println(number + "는 3의 배수가 아니며, ");
		}
		
		if((number%2) == 0)
		{
			System.out.println("짝수입니다");
		}
		else 
		{
			System.out.println("홀수입니다");
		}
	}

}
