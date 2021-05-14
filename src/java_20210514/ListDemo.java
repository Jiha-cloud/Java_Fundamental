package java_20210514;

import java.util.ArrayList;
import java.util.Iterator;

class Product {
	private int number;
	private String name;
	private double price;

	Product() { // alt+shift+s+c
		super();
	}

	Product(int number, String name, double price) { // alt + shift + s + o
		super();
		this.number = number;
		this.name = name;
		this.price = price;
	}

	// setter getter alt+shift+s+r
	int getNumber() {
		return number;
	}

	void setNumber(int number) {
		this.number = number;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

}

public class ListDemo {
	
	public static Product selectByNumber() {
		//Product pro = new Product(1,"신발", 100_000); // 각각 다른 type의 자료들을 객체화 해놓은 것
		return new Product(1, "신발", 100_000);
	}
	
	public static ArrayList select() {
		ArrayList list = new ArrayList();
		list.add(new Product(2,"라면",1000));
		list.add(new Product(3,"계란",1000));
		list.add(new Product(4,"우유",1000));
		list.add(new Product(5,"요플레",1500));
		
		return list;
	}
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		// ArrayList : 순서가 있고, 객체의 중복을 허용한다.
		
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("111");

		for (int i = 0; i < list.size(); i++) {
			String temp = (String) list.get(i); // get()이 object로 반환하기 때문에 원하는 type로 casting 해줘야됨.
			System.out.println(temp);
		}
		
		Product pro = selectByNumber(); // Product 객체를 하나 만들어서 넘겨줌
		System.out.printf("%d번 제품명 : %s 가격 : %,.2f원 \n", pro.getNumber(), pro.getName(), pro.getPrice());
		
		ArrayList proList = select();
		for (int i = 0; i < proList.size(); i++) {
			Product p = (Product) proList.get(i);
			System.out.printf("%d번 제품명 : %s 가격 : %,.2f원 \n", p.getNumber(), p.getName(), p.getPrice());
		}
	}
}
