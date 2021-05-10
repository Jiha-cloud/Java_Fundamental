package java_20210503;

public class ContinueDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i == 6)
				continue;
			sum += i;
		}
		System.out.println("합은 : " + sum);

		//두개의 의미는 같다. continue문은 코드가 길어질수록 좋다.
		
		int sum2 = 0;
		for (int i = 0; i <= 10; i++) {
			if (i != 6)
				sum2 += i;
		}
		System.out.println("합은 : " + sum2);
	}
}
