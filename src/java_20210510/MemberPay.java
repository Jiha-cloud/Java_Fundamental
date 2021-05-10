package java_20210510;

public class MemberPay { 
	private int seq;
	private int group;
	private String name;
	private int price;
	private boolean valid;
	private String status;
	private String sdate;
	private String edate;
	private String regdate;
	
	// seq의 setter => seq를 수정할 때 사용
	public void setSeq(int seq) {
		// this를 사용한 이유는 로컬 변수와 멤버 변수를 구분하기 위해서 사용
		this.seq = seq; // 왼쪽은 멤버 변수이고 오른쪽은 로컬 변수, this를 붙이지 않으면 멤버변수가 바뀌지 않음, 구분하기 위해 사용하는 거임.
	}
	// seq의 getter => seq의 정보를 가져올때 사용
	public int getSeq() {
		return seq;
	}
	
	// group의 setter => group을 수정할 때 사용
	public void setGroup(int group) {
		this.group = group;
	}
	// group의 getter => group의 정보를 가져올때 사용
	public int getGroup() {
		return group;
	}
	// name의 setter => name을 수정할 때 사용
	public void setName(String name) {
		this.name = name;
	}
	// name의 getter => name의 정보를 가져올 때 사용
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	// 자료형이 boolean일 경우 getXXX가 아니라 isXXX로 생성한다.
	public void isValid(boolean valid) {
		this.valid = valid;
	}
	public boolean getValid() {
		return valid;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public String getEdate() {
		return edate;
	}	
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public String getSdate() {
		return sdate;
	}	
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getRegdate() {
		return regdate;
	}
	
}	
