package chapter01;

public class PrimeDetect03 {
	
	public static void main(String[] args) {

	// Q : 1~1000까지 소수 전부 출력
		
		int k = 1;
		boolean isPrime = true;

		while (k <= 1000)
		{
			isPrime = isPrime(k);
			if (isPrime)
				System.out.println(k);
			k++;	
		}
	}
	
	public static boolean isPrime(int x)
	{
		boolean isPrime = true;
		
		int i = 2;
		while (i < x)
		{
			if(x % i == 0)
			{
				isPrime = false;
				break;
			}			
			i++;
		}
		return isPrime;
	}
	
}
