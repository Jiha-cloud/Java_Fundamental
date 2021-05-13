package java_20210513;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarSimple {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 4, 13); // 날짜 세팅, 안 하면 오늘로 나옴
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초 E요일"); // 년월일만 보고싶다면 빼면 됨.
		Date d = cal.getTime();
		String display = sdf.format(d);
		System.out.println(display);
		
	}
}
