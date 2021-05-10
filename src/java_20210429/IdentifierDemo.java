// 패키지명도 식별자에 포함 되기 때문에 식별자 규칙을 지켜야 한다.
package java_20210429;
// 클래스명도 식별자에 포함(대문자)
// 클래스명의 첫글자는 대문자로, 두 단어가 합쳐진 경우에는 두번째 단어의 첫글자는 대문자
public class IdentifierDemo {
	// 메서드명도 식별자에 포함
	// 클래스명을 제외한 모든 이름은 소문자로 시작한다.
	public static void main(String[] args) {
		int age = 20;
		String name = "Hello";
		
		//  첫글자는 숫자를 사용할 수 없음 (에러남)
		//String 1fathername = "John";
		// 공백을 사용할 수 없음 (에러남)
		//String mother Name = "Michel";
		// 예약을 사용할 수 없음 (에러남)
		//String void = "empty";
		// 자바는 유니코드를 사용하므로 한글로 이루어진 식별자도 가능하지만 비추천
		
		
		// Primitive data type
		
		// 정수형 Data types
		// byte => -128 ~ 127 == 8bit
 		// short => -32000 ~ 32000 == 16bit
		// int => -21000000000 ~ 21000000000 == 32bit
 		// long => 크다. == 64bit
		// int 형을 자주 쓴다
		// 정수형 리터럴 = 2진수(0b), 8진수(0), 10진수, 16진수(0x)
		
		// 실수형 Data types
		// float, double
		// e.g. float f1 = 24.2f; (f 써야 float 값임)
		// e.g. double d1 = 24.2d; (d 생략해도됨)
		// 주로 double을 쓴다.
		
		// 문자형 Data type
		// char
		// e.g. char a = '밥';
		
		// 문자열 Data type
		// String 
		
		// 논리형 Data type
		// boolean true/false
		// e.g. boolean isStop = false;
		
		String 이름 = "성영한";
		
		int b1 = 128;
		System.out.println(이름);
	}

}
