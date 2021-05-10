package java_20210506.bb; // 1
import java_20210506.aa.*;// 2
public class NoticeDemo2 extends Notice{ // 3
	public static void main(String[] args) {
		// 서로 다른 패키지의 클래스를 사용하기 위해서는
		// import 구분을 사용해야 한다.
		// package => import -> class 순으로 코딩해야 한다.
		Notice n1 = new Notice();
		n1.number = 1; //public 서로다른 패키지에서도 접근 가능
		//n1.title; protected 서로 다른 패키지에서 접근하려면 상속 받은 경우만 가능.
		//n1.hit; default 서로 다른 패키지에서 접근 불가능
		//regdate; private 서로 다른 패키지에서 접근 불가능
		
		NoticeDemo2 n2 = new NoticeDemo2();
		n2.number = 2;
		n2.title = ""; // 상속되었기 때문에 접근이 가능하다.
		//n2.hit; default는 접근 불가능
		//n2.regdate; regdate는 접근 불가능
	}
}
