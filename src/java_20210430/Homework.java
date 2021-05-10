package java_20210430;

public class Homework {
	public static void main(String[] args) {
		// 윤년 : 4의 배수 중에서 100의 배수 제외, 이 중 400의 배수는 윤년
		// 1년 1월 1일은 월요일
		// 2020*365 + 윤년햇수

		/*
		 * 달력만들기 1. 1년 1월 1일은 월요일 2. 1년은 365일이고, 윤년은 366일 - 2월 29일 3. 윤년은 4년마다 발생하고,
		 * 그중에서 100의 배수는 제외 400의 배수는 윤년 2021년 4월 30일은 무슨 요일일까요?
		 * 
		 * 
		 * 
		 * 
		 */

		int year = 2021;
		int month = 4;
		int day = 30;

		int leapYear = (year-1) / 4 - (year-1) / 100 + (year-1) / 400;
		int numOfDay = (year-1) * 365 + leapYear + 31 + 28 + 31 + 30; //2021년 4월 30일까지의 총일수
		if (numOfDay % 7 == 1) {
			System.out.printf("%d년 %d월 %d일은 월요일입니다.%n", year, month, day);
		} else if (numOfDay % 7 == 2) {
			System.out.printf("%d년 %d월 %d일은 화요일입니다.%n", year, month, day);
		} else if (numOfDay % 7 == 3) {
			System.out.printf("%d년 %d월 %d일은 수요일입니다.%n", year, month, day);
		} else if (numOfDay % 7 == 4) {
			System.out.printf("%d년 %d월 %d일은 목요일입니다.%n", year, month, day);
		} else if (numOfDay % 7 == 5) {
			System.out.printf("%d년 %d월 %d일은 금요일입니다.%n", year, month, day);
		} else if (numOfDay % 7 == 6) {
			System.out.printf("%d년 %d월 %d일은 토요일입니다.%n", year, month, day);
		} else {
			System.out.printf("%d년 %d월 %d일은 일요일입니다.%n", year, month, day);
		}
	}

}
