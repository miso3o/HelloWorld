package chapter01;

public class ContinueTest {

	public static void main(String[] args) {

		// Q : 1~20까지 2의 배수이거나 3의 배수가 아닌 수만 출력
		
		
		////////// continue 사용  //////////
		System.out.println("////////// continue 사용  //////////");

		for (int i = 1 ; i <= 20 ; i++)
		{
			
			if (i % 2 == 0 || i % 3 == 0)
				continue;
			System.out.println(i);
		}
		
		////////// continue 사용  //////////
		System.out.println("////////// && logical 사용  //////////");
		for (int i = 1 ; i <= 20 ; i++)
		{	
			if(i % 2 != 0 && i % 3 != 0)
				System.out.println(i);
		}
		
		////////// continue 사용  //////////
		System.out.println("////////// ! 사용  //////////");
		for (int i = 1 ; i <= 20 ; i++)
		{			
			if(!(i % 2 == 0 || i % 3 == 0))
				System.out.println(i);
		}
		
	}

}
