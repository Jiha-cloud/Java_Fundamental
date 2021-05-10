package java_20210510;

public class Admin {
	private String id;
	private String pwd;
	private String email;
	private int level;

	// 디폴트 생성자
	// 생성자 => [접근한정자][클래스이름](){} , 클래스 이름과 동일하게 써야하며 반환값이 없다.
	// 생성자의 역할은 인스턴스 변수 초기화
	// 생성자는 overloading이 가능하다.
	// 생성자는 overloading 가능
	// 생성자의 접근 한정자는 인스턴스의 유무를 결정한다.
	public Admin() {
		// super();
	}
	// this의 용법 2가지
	// 1. 자기자신 객체 => this or this. => 위치는 메서드, 생성자 모두 사용
	// 2. 다른 생성자를 호출해주는 this(); => 위치는 생성자에서만 사용가능
	public Admin(String id, String pwd, String email) {
		// 매개변수가 4개짜리 생성자를 호출해주는 this() 즉, 바로 아래의 생성자를 호출해서 굳이 복사 붙여넣기를 할 필요가 없음. 
		this(id,pwd,email,0);
	}
	public Admin(String id, String pwd, String email, int level) {
		// super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}

	public void setID(String id) {
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getID() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public String getEmail() {
		return email;
	}
	public int getLevel() {
		return level;
	}
}
                  