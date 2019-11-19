package chapter03;

public class ArrayUtilsTest {

	public static void main(String[] args) {
		
		int[] a1 = {10, 20, 30, 40};
		double[] d1 = ArrayUtils.intToDouble(a1);
		for(double v : d1) {
			System.out.print(v + " ");
		}
		System.out.print("\n");
		
		double[] d2 = { 10.1, 11.2, 12.3, 13.4, 14.5 };
		int[] a2 = ArrayUtils.doubleToInt(d2);
		for(int v : a2) {
			System.out.print(v);
		}
		System.out.print("\n");
		
		
		int[] a3 = {100, 200, 300, 400};
		int[] a4 = {500, 600, 700, 800};
		int[] a5 = ArrayUtils.concat(a3, a4);
		for(int v : a5) {
			System.out.print(v);
		}
		System.out.print("\n");
	}

}
