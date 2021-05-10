package java_20210510;

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name= "박지하"; // Employee 부모 클래스인 Customer의 모든 멤버변수를 상속받음
						// => 모든 멤버변수를 사용할 수 있다.
		e1.phone1 = "010";
		e1.phone2 = "6814";
		e1.phone3 = "2355";
		e1.zipcode = "12312";
		e1.addr1 = "경기도";
		e1.addr2 = "남양주시";
		e1.id = "qpal748596";
		e1.pwd = "1234";
	}
}
