package chapter01;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		// 배열의 필요성
		int student1Score = 90;
		int student2Score = 80;
		int student3Score = 70;
		int student4Score = 90;
		int student5Score = 100;
		int sum = student1Score + student2Score 
				+ student3Score + student4Score + student5Score;
		
		System.out.println(sum/5);
		
		int[] studentScores = new int[5];
		studentScores[0] = 90;
		studentScores[1] = 80;
		studentScores[2] = 70;
		studentScores[3] = 90;
		studentScores[4] = 100;
		
			// forloop 순회
		int sum2 = 0;
		for(int i = 0; i < studentScores.length; i++) 
			sum2 += studentScores[i];
		
		
		System.out.println(sum2/studentScores.length);
		
		// foreach 순회
		int sum3 = 0;
		for(int score :studentScores) 
			sum3 += score;
		
		System.out.println(sum3/studentScores.length);

	}

}
