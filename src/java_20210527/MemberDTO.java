package java_20210527;
// 1. 멤버 테이블을 객체화하는 것
// 용도: 1) 매개변수를 줄일 목적
// 		2) 테이블의 한개의 row 정보를 객체화 하기 위한 목적
public class MemberDTO {
	// member 테이블의 컬럼을 멤버번수로 설정
	
	public MemberDTO(int num, String name, String addr) {
		this.Num = num;
		this.Name = name;
		this.Addr = addr;
	}
	public MemberDTO() { // default constructor : 매개변수 없는 생성자
		super();
	}
	private int Num;
	private String Name;
	private String Addr;
	
	public int getNum() {
		return Num;
	}
	public void setNum(int num) {
		Num = num;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddr() {
		return Addr;
	}
	public void setAddr(String addr) {
		Addr = addr;
	}
	
	
	
}
