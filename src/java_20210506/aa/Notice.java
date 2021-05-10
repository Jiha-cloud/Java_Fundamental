package java_20210506.aa;

public class Notice {
	public int number;
	protected String title;
	int hit;
	private String regdate;
	public static void main(String[] args) {
		Notice n1 = new Notice();
		n1.number = 1; // public 접근 가능
		n1.title = "공지사항 입력"; // protected 접근 가능
		n1.hit = 0; // default 접근가능
		n1.regdate = "2021-05-06"; // private 접근 가능, 같은 package 내에서는 접근 가능
		
	}

}
