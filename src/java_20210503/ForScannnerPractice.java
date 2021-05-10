package java_20210503;
import java.util.*;

public class ForScannnerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("원하는 구구단 단 수를 입력하세요 > ");
		String tmp1 = scanner.nextLine();
		num1 = Integer.parseInt(tmp1);
		
		System.out.println();
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("어디까지 나타낼까요? > ");
		String tmp2 = scanner2.nextLine();
		num2 = Integer.parseInt(tmp2);
		
		System.out.println();
		System.out.printf("%d단의 %d까지만 나타냅니다.\n",num1,num2);
		System.out.println();
		
		for (int i = num1; i <= num1; i++) {
			for (int j = 1; j <= num2; j++) {
				System.out.printf("%d * %d = %d \n",num1,j,num1*j);
			}
			
		}
		
	}

}
