package java_20210429;

public class LiteralDemo {
	public void main(String[] args) {
		// byte 범위를 넘어가면 컴파일 에러 발생
		//byte b1 = 128;
		// 정수형 리터럴(byte, short, int)은 2진수, 8진수, 10진수, 16진수가 있음
		// long 리터럴은 숫자 뒤에 l,L로 표기함
		int a1 = 128; // 10
		int a2 = 076; // 8
		int a3 = 0x123; // 16
		int a4 = 0b1111; // 2
		long a5 = 200000l;
		
		//10진수를 표기할때 3자리 단위로 '_'를 사용할 수 있음
		int a6 = 1_000_000;
		
		//float의 리터럴은 숫자 뒤에 f,F로 표기함
		float f1 = 1234.43f;
		
		//double의 리터럴은 숫자 뒤에 d,D로 표기함(생략가능)
		double d1 = 1234.34;
		
		//boolean 리터럴은 true,false
		boolean isExited = false;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		
	}

}
