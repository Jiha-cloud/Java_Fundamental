package java_20210511;

public class Child extends Parent {
	String phone;
	String weight;
	String height;

	// alt+shift+s + o
	public Child(String name, String address, int age, String phone, String weight, String height) {
		super(name, address, age);
		this.phone = phone;
		this.weight = weight;
		this.height = height;
	}

	// 부모 클래스에 디폴트 생성자가 없다면 에러가 뜬다.
	public Child(String phone, String weight, String height) {

		this.phone = phone;
		this.weight = weight;
		this.height = height;
	}

}
