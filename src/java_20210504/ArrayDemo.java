package java_20210504;

public class ArrayDemo {
	public static void main(String[] args) {
		// length : 배열의 길이
		// length() : 문자열의 길이

		// 배열 선언, 생성
		int[] a = new int[100];

		// 배열 할당
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;

		for (int i = 0; i < 4; i++) {
			int temp = a[i];
			System.out.println(temp);

		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}

		// 배열 선언, 생성, 할당 동시에 이뤄짐.
		int[] b = { 100, 200, 300, 400 };

		// 배열 출력
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);

		}
		System.out.println();
		
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		int days=0;
		for (int i = 4; i < 8; i++) {
			days+=monthArray[i];
			
			
		}
		System.out.printf("5월 4일부터 9월 15일까지의 일수는 %d이다.",days+11);
	}

}
