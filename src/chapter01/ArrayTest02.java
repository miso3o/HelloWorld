package chapter01;

public class ArrayTest02 {
	public static void main(String[] args) {
		
		////////// 배열 변수 선언하는 방법 ////////// 

		int    array1[];     //1. 비추천
		int[]  array2;       //2. (******추천)
	//  int[10] array3;      //3. 오류
		
		
		
		
		////////// 배열 초기화 ////////// 
		
		//1. 기본적으로 숫자타입의 배열은 0으로 초기화가 된다.
		int[] array4 = new int[5];
		for(int n : array4)
			System.out.println(n);

		//2. 직접 값 대입으로 초기화
		int[] array5 = new int[5];
		array5[0] = 0;
		array5[1] = 1;
		array5[2] = 2;
		array5[3] = 3;
		array5[4] = 4;
		for(int n : array5) 
			System.out.println(n);
		
		//3. 배열 리터럴(literal)로 초기화(******추천)
		int[] array6 = {10, 20, 30, 40, 50};
		for(int n : array6) 
			System.out.println(n);
				
		//4. 리터럴 초기화 주의점(변수정의 = 변수선언 + 리터럴 초기화)
		//int[] array7;
		//array7 = {10, 20, 30, 40, 50};
		
		//5. 비추천 초기화
		int[] array8 = new int[] {100, 200, 300, 400, 500};
		for(int n : array8) 
			System.out.println(n);
	}
}
