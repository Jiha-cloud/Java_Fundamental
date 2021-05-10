package java_20210503;

import com.sun.source.tree.ContinueTree;

public class BreakDemo {
	public static void main(String[] args) {

		int sum = 0;

		aa: for (int i = 1; i <= 10; i++) { // 레이블 aa이다.
			if (i == 6)
				break aa;

			sum += i;
		}
		System.out.println("합은 : " + sum);

		outter: for (int i = 2; i <= 9; i++) {
			inner: for (int j = 1; j <= 9; j++) {
				if (i == 4 && j == 8) {
					break; //lable을 어떻게 찍느냐에 달라짐.
				}
				System.out.printf("%d * %d = %d \n", i, j, i * j);
			}

		}
	}
}
