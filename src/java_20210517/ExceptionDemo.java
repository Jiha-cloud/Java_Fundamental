package java_20210517;

import java.util.ArrayList;

public class ExceptionDemo {
	// 1.try -> 반드시 예외처리를 해야되는 경우
	//		 -> 예외처리를 해도 되고 안해도 되는 경우
	// 2. throws
	// 예외처리를 하는 이유 -> 실행단계에서(컴파일 에러 아님) 에러가 나더라도 예외를 통해 정상적으로 프로그램이 실행될 수 있도록 함.
	
	public static void main(String[] args) {
		// java.lang.NumberFormatException
		// parseInt는 예외처리를 해도되고 안해도 되는 메서드임.
		// aaaa1 => 예외처리해야 함
		// 12.34 => 코드를 변경해야 함
		int i = Integer.parseInt("11111"); //aaaa1,12.34
		System.out.println(i);
		// java.lang.NumberFormatException
		double d = Double.parseDouble("12.34");
		System.out.println(d);
		
		// java.lang.ArrayIndexOutOfBoundsException
		// 배열의 범위를 벗어나면 발생하는 예외
		int[] a = {1,2,3,4};
		System.out.println(a[3]); // a[4]
		
		// java.lang.IndexOutOfBoundsException
		// Collection에서 범위를 벗어나면 발새하는 예외
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(123);
		System.out.println(list.get(0)); //list.get(1)
		
		// java.lang.NullPointerException
		// 객체를 생성하지 않고 메서드를 사용하면 발생하는 예외
		String str = "hello"; // null
		System.out.println(str.length());
		
		int b = 10;
		int c = 0;
		System.out.println(b/c);
		
		// 예외 클래스 중 최상위 클래스가 try 블럭에서 가장 아래에 있어야 함.
	}
}
