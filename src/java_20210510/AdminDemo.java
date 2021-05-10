package java_20210510;

public class AdminDemo {
	public static void main(String[] args) {
		Admin a = new Admin("qpal748596", "123", "qpal748596@naver.com", 25); // 초기화 할때부터 값을 지정해줌. set을 할 필요가 없음.
		System.out.println(a.getID());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
		
		// id, pwd, email에는 각각 값으로 초기화하고 level은 0로 초기화
		Admin a2 = new Admin("qpa748596", "123", "qpal748596@naver.com");
		Admin a1 = new Admin();
		a1.setID("qpal748596");
		a1.setPwd("123");
		a1.setEmail("qpal748596@naver.com");
		a1.setLevel(25);
	}
}
