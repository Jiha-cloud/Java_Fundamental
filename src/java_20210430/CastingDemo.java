package java_20210430;

public class CastingDemo {
	public static void main(String[] args) {
		// overflow 발생하여 compile error
		//byte b1 = 129;
		
		// Circuit 현상
		byte b1 = (byte)129;
		System.out.println(b1);
		// Cutting 현상
		int i1 = (int)129.25;
		System.out.println(i1);
		
		// Auto-Casting
		double d1 = 124.5f;
		System.out.println(d1);
		
		// '+'는 1. '산술연산자' :
		// 자료형과 관계없이 연산을 하고 결과를 int 타입으로 반환
		byte b2 = 20;
		byte b3 = 30;
		byte b4 = (byte)(b2 + b3);
		int i2 = b2+b3;
		System.out.println(i2);
		System.out.println(b4);
		
		// 2. '연결연산자' :
		// "_____" + "______" = "______________"
		System.out.println(1+2+3+"abc");
		System.out.println("abc"+1+2+3);
		System.out.println("abc"+(1+2+3));
		
	}
}
