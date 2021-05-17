package java_20210517;

public class ThrowDemo {
	public static double withdraw(String account, int amount)
			throws InsufficientBalanceException, IncorrectAccountException {
		double myBalance = 10_000;
		String myAccount = "123-123-123456";
		if (myAccount.equals(account)) {
			if (myBalance - amount >= 0) {
				myBalance -= amount;
			} else {
				throw new InsufficientBalanceException("잔고가 부족합니다.");
			}
		} else {
			throw new IncorrectAccountException("잘못된 계좌번호입니다.");
		}
		return myBalance;
	}

	public static void main(String[] args) {
		double balance = 0;
		try {
			balance = withdraw("123-123-123456", 9_000);
			System.out.printf("잔고 : %,.1f\n", balance);
		} catch (InsufficientBalanceException e) {
			System.err.println(e.getMessage());
		} catch (IncorrectAccountException e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("저희 은행을 이용해주셔서 감사합니다.");
		}

	}
}
