package java_20210507;

public class StaticMethodDemo {
	String name;
	static double interestRate;

	public void m1() {
		System.out.println("instance method m1() 호출");
	}

	public void m2() {
		// instance method에서는 모든 변수를 사용하고
		// 모든 메서드를 호출할 수 있다.
		this.name = "성영한"; // this. => 자기 자신 인스턴스
		StaticMethodDemo.interestRate = 3.4;
		this.m1();
	}

	public static void m3() {
		System.out.println("static method m3() 호출");

	}

	public static void m4() {
		// static method에서는 static 변수와 static 메서드만 사용할 수 있다.
		// name = "홍길동";
		interestRate = 4.3;
		// m1();
		m3();
	}

	public static void main(String[] args) {
		m3();
		m4();
		interestRate = 4.3;
		StaticMethodDemo smd = new StaticMethodDemo(); // Static 메서드에 인스턴스 메서드를 불려오려면 인스턴스를 설정해줘야한다.
		smd.m2();
		smd.m1();
		smd.name = "박지하";
	}
}
