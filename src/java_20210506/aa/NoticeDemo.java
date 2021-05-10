package java_20210506.aa;

public class NoticeDemo {
	public static void main(String[] args) {
		Notice n1 = new Notice();
		n1.number = 1; // public 접근 가능, 서로 다른 package에서도 접근 가능, 
		n1.title = "공지사항 입력"; // protected 접근 가능, 서로 다른 package 그리고 상속 받은 경우만 접근 가능
		n1.hit = 0; // default 접근가능, 같은 package 내에서 접근 가능
		//n1.regdate = "2021-05-06"; // private 접근 불가능, 같은 class 내에서만 접근 가능
	}

}
