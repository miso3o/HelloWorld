package chapter01;

public class LeapYear {

	public static void main(String[] args) {

		// 1. 4로 나누어 떨어지는 년도는 윤년이다.
		// 2. 그 중 100으로 나누어 떨어지는 년도는 윤년이 아니다.
		// 3. 400으로 나누어 덜어지는 년도는 무조건 윤년이다.
		
		int year = 2004;
		
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
		{
			System.out.println(year + "년은 윤년입니다.");
		}
		else
		{
			System.out.println(year + "년은 윤년이 아닙니다.");
		}
	}

}
