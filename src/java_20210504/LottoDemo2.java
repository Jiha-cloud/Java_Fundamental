package java_20210504;

public class LottoDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {

			int random = (int) (Math.random() * 45 + 1);
			boolean isExisted = false;
			for (int j = 0; j < i; j++) {
				if (random == lotto[j]) {
					isExisted = true;
					break;
				}

			}
			if (isExisted) {
				i--;
			} else {
				lotto[i] = random;
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
}
