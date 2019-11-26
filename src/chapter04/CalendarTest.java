package chapter04;

import java.util.Calendar;

public class CalendarTest {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		printDate(cal);
		
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 10); // month(11)-1
		cal.set(Calendar.DATE, 26);
		printDate(cal);
		
		cal.set(2017,9, 10);
		
		
		
	}

	public static void printDate(Calendar cal) {
		String[] days = { "일", "월", "화", "수", "목", "금", "토", "일" };  
		String[] months = {"01","02","03","04","05","06","07","08","09","10","11","12"};
		
		// 년도
		int year = cal.get(Calendar.YEAR);
		
		// 월(0~11, +1)
		int month = cal.get(Calendar.MONTH);

		// 일
		int date = cal.get(Calendar.DATE);
		
		// 요일[1(일)~7(토)]
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		// 시
		int hour = cal.get(Calendar.HOUR);
		
		// 분
		int minute = cal.get(Calendar.MINUTE);

		// 초
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(
			year          + "-" +
		    months[month] + "-" +
			date          + "(" + 
			days[day-1]   + ") " +
		    hour          + ":" + 
			minute        + ":" +
		    second);
	}
}
