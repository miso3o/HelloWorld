package chapter03;

public class SwapTest {

	public static void main(String[] args) {
//		int i = 10;
//		int j = 20;
//		System.out.println(i + ":" + j);
//		swap(i, j);
//		System.out.println(i + ":" + j);
		
		Value v1 = new Value();
		v1.val = 10;
		Value v2 = new Value();
		v2.val = 20;
		System.out.println(v1.val + ":" + v2.val);
		
		swap2(v1, v2);
		System.out.println(v1.val + ":" + v2.val);
	}

	public static void swap2(Value p, Value q) {
		int temp = p.val;
		p.val = q.val;
		q.val = temp;
	}
	
	public static void swap(int p, int q) {
		int temp = p;
		p = q;
		q = temp;
	}
}
