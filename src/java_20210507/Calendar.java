package java_20210507;

// 년,월,일을 넣으면 요일을 알려주는 것
// 년, 월을 넣으면 월 달력이 나옴
// 년을 넣으면 달력이 나옴.
// public void print(int year, int month, int day) 하면 바로 요일 나옴
// public void print(int year, int month) 하면 월 달력이 나옴
// public void print(int year) 하면 년 달력이 나옴.
public class Calendar {
	private int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;
	public static final int SUNDAY = 0;

	private void change(int year) {
		if (isLeafYear(year)) {
			monthArray[1] = 29;
		}
	}
	private boolean isLeafYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	private int getCount(int year, int month, int day) {
		int leapYear = (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		boolean isLeafYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

		change(year);
		int numOfDay = (year - 1) * 365 + leapYear;
		for (int i = 0; i < month - 1; i++) {
			numOfDay += monthArray[i];

		}
		numOfDay += day;
		return numOfDay;
	}

	public void print(int year, int month, int day) {

		change(year);
		int numOfDay = getCount(year, month, day);
		int dayOfWeek = numOfDay % 7;
		String Message = "";

		if (dayOfWeek == Calendar.MONDAY) {
			System.out.printf("%d년 %d월 %d일은 월요일입니다.%n", year, month, day);
		} else if (dayOfWeek == Calendar.TUESDAY) {
			System.out.printf("%d년 %d월 %d일은 화요일입니다.%n", year, month, day);
		} else if (dayOfWeek == Calendar.WEDNESDAY) {
			System.out.printf("%d년 %d월 %d일은 수요일입니다.%n", year, month, day);
		} else if (dayOfWeek == Calendar.THURSDAY) {
			System.out.printf("%d년 %d월 %d일은 목요일입니다.%n", year, month, day);
		} else if (dayOfWeek == Calendar.FRIDAY) {
			System.out.printf("%d년 %d월 %d일은 금요일입니다.%n", year, month, day);
		} else if (dayOfWeek == Calendar.SATURDAY) {
			System.out.printf("%d년 %d월 %d일은 토요일입니다.%n", year, month, day);
		} else {
			System.out.printf("%d년 %d월 %d일은 일요일입니다.%n", year, month, day);
		}
		System.out.println();
	}

	public void print(int year, int month) {
		System.out.printf(year + "년 " + month + "월\n");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		boolean isLeafYear = isLeafYear(year);
		change(year);

		// /t 만큼 띄어쓰기 해야한다. 예) 2021년 5월 달력을 출력하기 위해서는
		// 2021년 5월 1일까지 총 날짜를 구해서 7로 나눈 나머지만큼
		// 띄어쓰기 하면 된다.
		int numOfDays = getCount(year, month, 1);
		int rest = numOfDays % 7;

		for (int i = 0; i < rest; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= monthArray[month - 1]; i++) {
			System.out.print(i + "\t");
			if (rest % 7 == 6)
				System.out.println();
			rest++;
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

	public int leapYear(int year) {
		return (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
	}
}
