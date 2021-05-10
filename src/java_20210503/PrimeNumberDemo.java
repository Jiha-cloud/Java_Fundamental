package java_20210503;

public class PrimeNumberDemo {
	public static void main(String[] args) {

		int theNumOfPrimeNum = 0;
		int sumOfPrimeNum = 0;
		int theNumOfCal = 0;

		for (int num = 2; num <= 100; num++) {
			int theNumOfNumResult = 0;
			for (int i = 2; i < num; i++) {
				
				if (num % i != 0) {
					theNumOfNumResult++;
				}
			}
			if ((num - 2) == theNumOfNumResult) {
				System.out.print(num + "\t");
				theNumOfPrimeNum++;
				sumOfPrimeNum += num;
			}

		}
		System.out.print("\n");
		System.out.printf("1부터 100까지 소수의 개수는 %d개 입니다.\n", theNumOfPrimeNum);
		System.out.printf("1부터 100까지 소수의 전체 합은 %d 입니다.\n", sumOfPrimeNum);
	}
}


