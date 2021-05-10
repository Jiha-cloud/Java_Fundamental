package java_20210503;

public class ForDemo {
	public static void main(String[] args) {
		// breakpoint 왼쪽 숫자를 더블클릭하면 breakpoint가 설정되는데
		// 디버깅 버튼을 누르고 stepover 버튼을 누르면 breakpoint까지 한번씩 실행되서 과정을 지켜볼 수 있다.
		// 복잡한 for문을 사용할때 유용할듯
		// 멈추는 건 빨간 Stop버튼 누르면 됨.
		// Package Explorer를 누르면 원래 파일모음을 볼 수 있음.
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;

		}
		System.out.printf("1부터 10까지의 합은 %d입니다.\n", sum);

		int sumEven = 0; // 짝수 합을 구하기 위해 10번을 돌렸으므로 좋은 코드가 아니다.
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			}
		}
		System.out.printf("1부터 10까지의 짝수 합은 %d입니다.\n", sumEven);

		int sumEven2 = 0; // 짝수 합을 구하기 위해 5번만 돌렸으므로 좋은 코드라 할 수 있다.
		for (int i = 2; i <= 10; i += 2) {
			sumEven2 += i;
		}
		System.out.printf("1부터 10까지의 짝수 합은 %d입니다.\n", sumEven2);

		for (int first = 2; first <= 9; first++) {
			System.out.printf("%d단 입니다.\n", first);
			for (int second = 1; second <= 9; second++) {
				System.out.printf("%d * %d = %d \n", first, second, first * second);

			}
		}
		
		int totalCountOfPrimeNumber = 0;
		int totalIndex = 0;
		
		for (int i = 2; i <=100; i++) {
			int count =0;
			for (int j = 1; j <= i; j++) {
				if(i%j ==0) {
					count++;
				}
				totalIndex++;
				
			}
			if(count==2) {
				totalCountOfPrimeNumber++;
				System.out.print(i + "\t");
			}
			totalIndex++;
		}
		System.out.println();
		System.out.printf("%d",totalCountOfPrimeNumber);

		}

	}

