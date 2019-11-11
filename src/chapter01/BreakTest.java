package chapter01;

public class BreakTest {

	public static void main(String[] args) {

		// 0에서부터 합이 5000이상이 될 때 까지 계속 합을 하는 루틴
		
		////////// while 사용 //////////
		int sum1 = 0;		
		int i1 = 0 ;
		while (sum1 < 5000) 
		{
			sum1 += i1;
			i1++;
		}
		System.out.println(sum1);

		
		////////// for문 사용 //////////
		int sum2 = 0;		
		for(int i2 = 0; sum2 <5000; i2++)
			sum2 += i2;
		System.out.println(sum2);

		
		////////// 무한Loop 사용(while, break) //////////
		int sum3 = 0;	
		int i3 = 0;
		while(true)
		{
			sum3 += i3;
			if(sum3 >= 5000)
				break;
			i3++;
		}
		System.out.println(sum3);

		
	}

}
