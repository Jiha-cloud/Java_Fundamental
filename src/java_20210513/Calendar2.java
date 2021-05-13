package java_20210513;

import java.text.SimpleDateFormat;
import java.util.Calendar;

// 년,월,일을 넣으면 요일을 알려주는 것
// 년, 월을 넣으면 월 달력이 나옴
// 년을 넣으면 달력이 나옴.
// public void print(int year, int month, int day) 하면 바로 요일 나옴
// public void print(int year, int month) 하면 월 달력이 나옴
// public void print(int year) 하면 년 달력이 나옴.
public class Calendar2 {
	private Calendar cal;
	public Calendar2() {
		cal = Calendar.getInstance();
	}
	public void print(int year, int month, int day) {
		cal.set(year, month-1, day);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일입니다.");
		System.out.println(sdf.format(cal.getTime()));
	}

	public void print(int year, int month) {
		cal.set(year, month-1,1);
		System.out.printf(year + "년 " + month + "월\n");
		System.out.println("일\t월\t화\t수\t목\t금\t토");

		// /t 만큼 띄어쓰기 해야한다. 예) 2021년 5월 달력을 출력하기 위해서는
		// 2021년 5월 1일까지 총 날짜를 구해서 7로 나눈 나머지만큼
		// 띄어쓰기 하면 된다.
		
		// 1-> 일요일 2-> 월요일 ... 7-> 토요일
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

		for (int i = 0; i < dayOfWeek-1; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
			System.out.print(i + "\t");
			if (dayOfWeek % 7 == 0)
				System.out.println();
			dayOfWeek++;
		}
		System.out.println();
		System.out.println();
	}

	public void print(int year) {
		for (int i = 1; i <= 12; i++) {
			print(year, i);
			System.out.println();
			System.out.println();
		}

	}

}
