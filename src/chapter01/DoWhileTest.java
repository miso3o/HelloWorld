package chapter01;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {

		// 사용자가 0을 입력할때 까지 계속 더함
		
		Scanner scanner = new Scanner(System.in);
				
		int input = 0;
		int sum = 0;
		
		do 
		{
			System.out.print("Enter number (0 for quit) > ");
			input = scanner.nextInt();
			sum = sum + input;
			if (input == 0)
				System.out.println("Total = " + sum);	
		}
		while(input > 0);
			
		scanner.close();	
	}

}
