package chapter01;

public class Gugudan03 {

	public static void main(String[] args) {

		for (int k = 1; k <= 9; k++)
		{
			for(int i = 1; i <= 9 ; i++)
				System.out.print(i + " x " + k + " = " + k*i + "\t");
			System.out.println();
		}
	}
}
