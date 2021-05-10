package java_20210503;

public class WhileDemo {
	public static void main(String[] args) {
		int sum = 0;
		int sum2 = 0;
		int i = 1;// 초기값 while문은 밖에다가 설정해야함
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.printf("1부터 10까지 합은 %d 입니다.", sum);
		System.out.println();

		int j = 1;
		for (; j <= 10;) {
			sum2 += j;
			j++;
		}
		System.out.printf("1부터 10까지 합은 %d 입니다.", sum2);
		System.out.println();

		int num1 = 2;

		while (num1 <= 9) {
			System.out.printf("%d단 입니다.\n", num1);
			int num2 = 1;
			while (num2 <= 9) {
				System.out.printf("%d * %d = %d \n", num1, num2, num1 * num2);
				num2++;
			}
			num1++;
		}
		System.out.println();
		
		int title = 2;
		while (title<=9) {
			System.out.print("\t" + title + "단\t");
			title++;
		}
		System.out.println();
		int n1 = 1;
		while (n1 <= 9) {
			int n2 = 2;
			while (n2 <= 9) {
				System.out.print(n2 + " * " + n1 + " = " + n2 * n1 + "\t");
				n2++;
			}
			System.out.println();
			n1++;
		}
	}
}
