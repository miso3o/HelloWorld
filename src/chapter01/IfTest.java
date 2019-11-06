package chapter01;

public class IfTest {

	public static void main(String[] args) {
	
		int a = 10;
		int b = 15;
		int dif = 0;
		
		if(a>b) {
			dif = a-b;
		}
		else {
			dif = b-a;
		}
		
		System.out.println("a와 b의 차이는 "+ dif);
	}
}
