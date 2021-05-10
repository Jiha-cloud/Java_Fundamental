package java_20210504;

public class LottoDemoDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int random = (int) (Math.random() * 45 + 1);
			if (i != 0) {
				for (int j = i; j >= 1; j--) {
					if (random == lotto[j - 1]) {
						random = (int) (Math.random() * 45 + 1);
					}
				}
			}
			lotto[i] = random;
		}

		int number;
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] < lotto[j]) {
					number = lotto[j];
					lotto[j] = lotto[i];
					lotto[i] = number;
				}
			}

		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("%d번 번호는 %d 입니다. \n", i + 1, lotto[i]);
		}
		System.out.println("보너스번호는 " + (int) (Math.random() * 45 + 1));

	}

}
