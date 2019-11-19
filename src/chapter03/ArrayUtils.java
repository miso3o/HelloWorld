package chapter03;

public class ArrayUtils {
	
	public static double[] intToDouble(int[] a1) {
		int length = a1.length;
		
		double[] result = new double[length];
		for(int i = 0; i < length; i++) {
			result[i] = a1[i];
		}
		
		return result;
	}

	public static int[] doubleToInt(double[] d2) {
		int length = d2.length;
		
		int[] result = new int[length];
		for(int i = 0; i < length; i++) {
			result[i] = (int)d2[i];
		}
		
		return result;
	}
		
		public static int[] concat(int[] a3, int[] a4) {
			int length = (a3.length >= a4.length) ? a3.length : a4.length;
						
			int[] result = new int[length];
			for(int i = 0; i < length; i++) {
				result[i] = (a3[i] >= a4[i]) ? a3[i] : a4[1];
			}
			
			return result;
	}
}
