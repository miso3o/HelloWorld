package chapter04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {

		Date now = new Date();
		
		System.out.println(now);
		
		printDate1(now);
		printDate2(now);

	}

	
	public static void printDate1(Date d)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(sdf.format(d));
		System.out.println(sdf2.format(d));
	}
	
	public static void printDate2(Date d)
	{
		// 1. 연도 + 1900   <- 밀레니엄버그
		int year = d.getYear() + 1900;
		
		// 2. 월(0~11 +1) 
		int month = d.getMinutes() + 1;
		
		// 3. 일
		int date = d.getDate();
		
		//시간
		int hours = d.getHours();
		
		//분
		int minutes = d.getMinutes();
		
		//초
		int seconds = d.getSeconds();
		
		System.out.println(
			(year+1900) + "-" +
		    (month+1)   + "-" + 
			date        + " " +
		    hours       + ":" +
			minutes     + ":" +
		    seconds);
	}
}
