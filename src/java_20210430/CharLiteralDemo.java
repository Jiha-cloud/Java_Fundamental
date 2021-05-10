package java_20210430;

public class CharLiteralDemo {
	// src에 커서 두고 ctrl + n 하면 클래스 파일 바로 생성 가능
	// ctrl + m 하면 전체화면 가능
	// 실행 단축키는 ctrl + f11
	// 줄복사는 ctrl + alt + 방향키 아래
	// 줄 이동은 alt + 방향키
	public static void main(String[] args) {
		// char 리터럴 => 문자표현법
		char c1 = '박';
		char c2 = '지';
		char c3 = '하';
		
		System.out.print(c1);
		System.out.print(c2);
		System.out.println(c3);
		
		// char 리터럴 => 유니코드 표현법
		char c4 = '\ubc15';
		char c5 = '\uc9c0';
		char c6 = '\ud558';
		
		System.out.print(c4);
		System.out.print(c5);
		System.out.println(c6);
		
		//char 리터럴 => 아스키코드 표현법
		char c7 = 48;
		char c8 = 65;
		char c9 = 97;
		
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);
		
		// char ' \' ' , ' \\ ' , ' " '
		// String " ' " , " \\ ", " \" "
		
		char c10 = '\'';
		char c11 = '\\';
		char c12 = '"';
		String str1 = "'";
		String str2 = "\\";
		String str3 = "\"";
		String str4 = "C:\\eclipse";
		
		System.out.print(c10);
		System.out.print(c11);
		System.out.print(c12);
		System.out.print(str1);
		System.out.print(str2);
		System.out.print(str3);
		System.out.println(str4);
		
		// 특수문자 \t, \n
		System.out.println("안녕하세요.\n저는 박지하입니다.\n잘 부탁드립니다.");
		System.out.println("너와 나의 떨어진 거리는 \t\t 이만큼이야");
		System.out.println("아이디\t이름\t지역");
		
		// 크기를 벗어나는 값을 강제로 형변환한 예시 Circuit 현상
		byte b1 = (byte) 129;
		System.out.println(b1);
		// 크기를 벗어나는 값을 강제로 형변환한 예시 Cutting 현상
		int i = (int) 42.57;
		System.out.println(i);
		// Auto-Casting
		double d1 = 14.41f;
		int a2 = 10;
		long l1 = a2;
		System.out.println(d1);
		System.out.println(l1);
	}

}
