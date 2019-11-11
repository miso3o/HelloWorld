package chapter01;

public class Gugudan1 {

	public static void main(String[] args) {

		int k = 1;
		while (k <= 9)
		{
			System.out.println();
			System.out.println("<< " + k + "단 >>");
			int i = 1;
			while (i <=9)
			{
				System.out.println(k + " x " + i + " = " + k*i);
				i++;
			}
			k++;
		}
	}

}
