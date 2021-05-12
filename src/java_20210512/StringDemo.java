package java_20210512;

public class StringDemo {
	public static String reverse(String str) {
		int strL = str.length();
		String strN = "";
		for(int i=strL;i>0;i--) {
			strN += str.substring(i-1,i);
		}
		return strN;
	}
	public static void m(int a, int[] b, String s) {
		a = 10;
		b[3] = 40000;
		s += "123";
	}
	public static void main(String[] args) {
		String str = "beautiful"; //=> lufituaeb
		String str5 = reverse(str);
		System.out.println(str.length());
		System.out.println(str5);
		int a= 20;
		int[] b= {1,2,3,4};
		String s = "test";
		
		System.out.println(a+","+b[3]+","+s);
		m(a,b,s);
		System.out.println(a+","+b[3]+","+s);
		
		String str1 = new String("hello"); // new 연산자로 값을 설정하는게 좋음
		String str2 =  new String("hello");
		String str3 = "test";
		String str4 = "test";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
	}
}
