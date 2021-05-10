package java_20210506;

public class CustomerDemo {

	public static void main(String[] args) {

		Customer c1 = new Customer();
		c1.name = "성영한";
		c1.age = 20;
		c1.email = "test@test.com";
		c1.phone = "010-9090-9090";
		c1.balance = 1_000_000;
		c1.released = false;
		// 클래스 변수(static 변수)는 클래스 이름으로 접근하는 것이 관례
		// 변수로도 접근가능하나 권장하지 않음. 예) c1.interestRate = 6.2;
		Customer.interestRate = 6.2;
		//Customer.bankName = "국민은행"; final 변수의 값은 재할당할 수 없다.
		//c1.interestRate = 6.2;

		System.out.printf("%s, %d, %s, %s, %f, %s, %n", c1.name, c1.age, c1.email, c1.phone, c1.balance, c1.released);

		Customer c2 = new Customer();
		c2.name = "손정의";
		c2.age = 30;
		c2.email = "ceo@softbank.com";
		c2.phone = "010-1231-2222";
		// int로 표기할 수 있는게 21억까지인데 넘어가므로 long을 나타내는 l을 붙여야함.
		c2.balance = 50_000_000_000_000l; 
		c2.released = false;
		//c1.interestRate = 8.2;
		
		// 객체들이 모두 공유하므로 값이 바뀌면 그 바뀐 값을 또 모든 객체가 공유함.
		System.out.printf("%f, %f \n",c1.interestRate, c2.interestRate); 
		System.out.printf("%s, %d, %s, %s, %f, %s, %n", c2.name, c2.age, c2.email, c2.phone, c2.balance, c2.released);
		
		Customer c3 = c2;
		c3.name = "손정의1";
		System.out.printf("%s , %s \n", c2.name, c3.name);
		
		c3 = new Customer();
		c3.name = "손정의2";
		System.out.printf("%s , %s", c2.name, c3.name);
		
	}

}
