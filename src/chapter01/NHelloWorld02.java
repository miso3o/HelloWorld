package chapter01;

import java.util.Scanner;

public class NHelloWorld02 {

	public static void main(String[] args) {

		System.out.print("Hello World를 반복하고자 하는 값을 입력하세요 :");

		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt(); // blocking
		scanner.close();
		
		for (int n = 1; n < count; n++)
			System.out.println(n + " HelloWorld");
		
	}
}
