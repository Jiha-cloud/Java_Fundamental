package java_20210511;

class A {

}

class B extends A {

}
// 이렇게 하면 디폴트 생성자가 자동으로 생성되어 있는 상태라서 에러가 안난다.

class A1 {
	int a;

	A1(int a) {
		this.a = a;
	}
}

class B1 extends A1 {
	B1() {
		super(10); // 부모클래스에서 int값을 받는 생성자를 호출하는 것
	}

}

public class SuperDemo {
	public static void main(String[] args) {
		B1 b = new B1();
		System.out.println(b.a);
	}
}
