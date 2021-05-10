package java_20210507;

public class MethodDemo {
	public void print(int year, int month) {
		System.out.println("일\t월\t화\t수\t목\t금\t토\n");
		int leapYear = (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// and문이 or문보다 연산순서가 앞서므로 괄호가 필요없긴함.
		boolean isLeafYear = isLeafYear(year);
		if (isLeafYear) {
			monthArray[1] = 29;
		}
		for (int i = 1; i <= monthArray[month-1]; i++) {
			System.out.print(i + "\t");
			if (i % 7 == 0)
				System.out.println();
		}
	}

	public int plus(int a, int b) { // a,b => 매개변수(Parameters)
		return a + b;
	}

	public boolean isLeafYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo m = new MethodDemo();
		int sum = m.plus(10, 20); // 10,20 => 인자(Arguments)
		System.out.println(sum);
		System.out.printf("%d\n", sum);

		boolean leafYear = m.isLeafYear(2100);
		System.out.printf("%s \n", leafYear);

		int[] test = { 10, 100, 30, 45, 90, 55, 61, 22 };
		AscendingDemo asc = new AscendingDemo();
		DescendingDemo desc = new DescendingDemo();
		int[] testAscending = asc.ascending(test);
		for (int i = 0; i < testAscending.length; i++) {
			System.out.printf("%d \t", testAscending[i]);
		}
		
		int[] testDescending = desc.descending(test);
		System.out.println();
		for (int j = 0; j < testDescending.length; j++) {
			System.out.printf("%d \t", testDescending[j]);

		}
		System.out.println();
		System.out.println();
		m.print(2020, 2);

	}
}