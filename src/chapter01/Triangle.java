package chapter01;

public class Triangle {

	public static void main(String[] args) {

		// ****** 6줄 찍기		
		for(int i = 1; i <= 6; i++)
		{
			for(int j = 1;  j <= 6; j++)
				System.out.print("X");
			System.out.println();
		}
		
		System.out.println();
		
		// * 직각삼각형 찍기		
		for(int i = 1; i <= 6; i++)
		{
			for(int j = 1;  j <= i; j++)
				System.out.print("X");
			System.out.println();
		}
		
		System.out.println();
		
		// * 역직각삼각형 찍기		
		for(int i = 6; i > 0; i--)
		{
			for(int j = 1;  j <= i; j++)
				System.out.print("X");
			System.out.println();
		}
		
		System.out.println();
		
		// * 커졌다 작아지기
		for(int i = 1; i <= 6; i++)
		{
			for(int j = 1;  j <= i; j++)
				System.out.print("X");
			System.out.println();
		}
		for(int i = 6; i > 0; i--)
		{
			for(int j = 1;  j <= i; j++)
				System.out.print("X");
			System.out.println();
		}
		
		
	}

}
