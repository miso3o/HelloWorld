package chapter01;

public class PrimeDetect04 {
	
	public static void main(String[] args) {

		// For문 사용
		// Q : 1~1000까지 소수 전부 출력
			
			boolean isPrime = true;

			for (int k = 1; k <= 1000; k++)
			{
				isPrime = isPrime(k);
				if (isPrime)
					System.out.println(k);
			}
		}
		
		public static boolean isPrime(int x)
		{
			boolean isPrime = true;
			
			for(int i = 2 ; i < x ; i++)
			{
				if(x % i == 0)
				{
					isPrime = false;
					break;
				}			
			}
			return isPrime;
		}
}
