package java_20210513;

import java.util.Calendar;
public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		// cal.set(1900,1,13);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		// int hour = cal.get(Calendar.HOUR);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.printf("%d 년 %d 월 %d 일 \n", year, month+1, day);
		System.out.printf("%d : %d : %d \n", hour, minute, second);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		
		StringBuffer message = new StringBuffer();
		System.out.println(dayOfWeek);
		
		
		if (dayOfWeek == Calendar.SUNDAY) {
			message.append("일요일");
		}else if(dayOfWeek == Calendar.MONDAY) {
			message.append("월요일");
		}else if(dayOfWeek == Calendar.TUESDAY) {
			message.append("화요일");
		}else if(dayOfWeek == Calendar.WEDNESDAY) {
			message.append("수요일");
		}else if(dayOfWeek == Calendar.THURSDAY) {
			message.append("목요일");
		}else if(dayOfWeek == Calendar.FRIDAY) {
			message.append("금요일");
		}else if(dayOfWeek == Calendar.SATURDAY) {
			message.append("토요일");
		}
		System.out.printf("%d 년 %d 월 %d 일 %s 입니다. \n",year, month+1, day, message);
		// 해당 월의 마지막 날짜를 반환
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastDay);
	}
}
