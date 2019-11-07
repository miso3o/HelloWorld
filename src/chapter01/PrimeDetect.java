package chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {

		// Q : 키보드에서 입력받은 숫자가 소수(Prime number)인지 아닌지 판단하려고 합니다.
		// 2부터 시작해서 자신보다 작은 숫자까지 나누어 나머지 값이 0이 나오지 않을때 소수라고 결론 내리려 합니다.
		// 입력받는 숫자는 양의 정수라고 가정하고 
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("소수인지 판단하고자 하는 숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		scanner.close();
		
		boolean isPrime = true;
		
		int i = 2;
		while (i < num)
		{
			if(num % i == 0)
			{
				isPrime = false;
				break;
			}			
			i++;
		}
		
		
		if(isPrime)
			System.out.println(num + "은 소수입니다.");
		else
			System.out.println(num + "은 소수가 아닙니다.");
		
	}

}
