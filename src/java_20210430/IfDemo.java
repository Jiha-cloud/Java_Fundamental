package java_20210430;

public class IfDemo {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]); // run configuration에 들어가서 argument-program argument에 숫자 넣어야함.
		String season = "";
		if (month == 12 || month == 1 || month == 2) {
			season = "겨울";
		} else if (month == 3 || month == 4 || month == 5) { // else if(month >= 3 && month <=5)
			season = "봄";
		} else if (month == 6 || month == 7 || month == 8) {
			season = "여름";
		} else if (month == 9 || month == 10 || month == 11) {
			season = "가을";
		} else {
			season = "없는 계절";
		}
		System.out.println(month + "월은 " + season + "입니다.");
		// 코딩 다하고 ctrl + shift + f 누르면 알아서 띄어쓰기 해줌.

		int a = 125900;
		double d = 125234.789;
		String name = "박지하";

		System.out.printf("a는 %-20d입니다.%n", a); // %n은 개행해줌, %10d는 10자리 숫자로 나타내라. %020d는 앞에 0을 채워줌. %-20d는 실 숫자를 앞에 쓰고
												// 뒤로 빈칸.
		System.out.printf("d는 %,.2f입니다.%n", d); // %,f는 3자리마다 콤마찍어줌. %.2f는 소수점 둘째짜리까지 나타내고 반올림.
		System.out.printf("저는 %s입니다.%n", name);
		System.out.printf("저는 %s, %d, %.2f입니다.%n", name, a, d);

		int a1 = 100;
		String msg = "";
		if (a1 % 2 == 0) {
			msg = "짝수";
		} else {
			msg = "홀수";
		}

		System.out.println(msg);

		msg = (a1 % 2 == 0) ? "짝수" : "홀수";
		System.out.println(msg);
	}
}
