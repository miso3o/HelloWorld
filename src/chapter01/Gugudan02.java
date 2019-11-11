package chapter01;

public class Gugudan02 {

	public static void main(String[] args) {

		for (int k = 1; k <= 9; k++)
		{
			System.out.println();
			System.out.println("<< " + k + "단 >>");
			
			for(int i = 1; i <= 9 ; i++)
				System.out.println(k + " x " + i + " = " + k*i);
		}
	}
}
