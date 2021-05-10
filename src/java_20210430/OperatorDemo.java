package java_20210430;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10, b = 22;
		int c = 0;
		double d = 0.0;
		c = a + b;
		System.out.println(c);
		
		c = a - b;
		System.out.println(c);
		
		c = a * b;
		System.out.println(c);
		
		c = b / a;
		System.out.println(c);

		//double과 int를 연산하면 double로 나온다.
		// 즉, 한쪽만 casting 하면 된다.
		d = (double)b / a;
		System.out.println(d);
		
		c = b % a;
		System.out.println(c);
		
		if(a%2==0) {
			System.out.println("a는 짝수");
		}else {
			System.out.println("a는 홀수");
		}
		// 복합대입연산자
		
		a+= b; // a=a+b
		System.out.println(a);
		
		int sum = 0;
		for(int i=1; i<=100;i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		// 증감연산자
		a++;
		++b;
		
		System.out.println(a); // a=33
		System.out.println(b); // b=23
		
		c = a++; // c=33으로 대입된 후 a+1 = 34
		System.out.println(c);
		
		c = ++a; // a+1 해서 a = 35가 된 후 c에 대입
		System.out.println(c);
		
		// primitive data type => 값비교, 자료형은 고려하지 않는다
		// 10 == 10.0 = true
		
		// 비교연산자
		a = 10;
		b = 20;
		boolean isSuccess = a > b;
		System.out.println(isSuccess);
		
		if(a>b) {
			System.out.println("a가 b보다 크다");
		}
		else {
			System.out.println("a가 b보다 작다");
		}
		
		d = 10.0;
		isSuccess = a==d;
		System.out.println(isSuccess);
		
		
		// 논리연산자
		a=10;
		b=20;
		isSuccess = (a==b) && (++a == b++); // short circuit이 발생해서 뒷 연산을 시행하지 않았음.
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		
		isSuccess = (a==b) || (++a == b++);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		
		a=10;
		b=20;
		isSuccess = (a!=b) || (++a == b++); // Short circuit이 발생해서 뒷 연산을 시행하지 않았음.
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		
		// 연산자 우선순위 1. 덧셈뺄셈보단 곱셈나눗셈이 먼저 2. ||보단 &&이 우선 3. 모르면 괄호 치기
		
		}
		}
	

