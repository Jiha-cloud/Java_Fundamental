package java_20210514;

import java.util.ArrayList;

public class GenericDemo {
	public static void main(String[] args) {
		//ArrayList list = new ArrayList(); // 이 상태는 데이터의 안정성이 없다.
		ArrayList<String> list = new ArrayList<String>(); // generic : 원하는 자료형 명시
		list.add("1");
		list.add("2");
		list.add("3"); 
		
		for (int i = 0; i < list.size(); i++) {
			String value = list.get(i); // generic으로 자료형을 명시했기 때문에 casting 안해도됨.
			System.out.println(value);
		}
		
		for(String value : list) {
			System.out.println(value);
		}
	}

}
