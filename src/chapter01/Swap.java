package chapter01;

public class Swap {

	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 30;
		
		// Q1 : n1값이 항상 큰 값이 되도록, 필요할 경우 n1과 n2를 교체하라.
		
		if (n1 < n2)
		{
			int temp = n2;
			n2 = n1;
			n1 = temp;
		}

		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);

		// Q2 : 최대값을 판별하는 조건을 완성해 보세요.
		int a1 = 20;
		int a2 = 10;
		int a3 = 50;
		
		int max = 0;
		
		if (a1 >= a2)	  // a1>=a2
		{
			if(a1 >= a3)  // a1>=a2 && a1>=a3
			{
				max = a1;
			}
			else		  // a1>=a2 && a3>a1
			{
				max = a3;
			}
		}
		else			   // a2>a1
		{
			if(a2 >= a3)   // a2>a1 && a2>=a3
			{
				max = a2;
			}
			else		   // a2>a1 && a3>a2
			{
				max = a3;
			}
		}
		
		
		System.out.println("최대값은 " + max + "입니다.");

		
	}

}
