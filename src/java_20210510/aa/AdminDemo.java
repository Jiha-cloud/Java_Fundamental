package java_20210510.aa;
import java_20210510.Admin; // 접근한정자가 default이므로 패키지가 달라서 import조차 되지 않는다. => Admin class의 접근한정자를 public으로 바꾸고 나서야 
							// import가 된다.
public class AdminDemo {
	public static void main(String[] args) {
		Admin a = new Admin();
	}
}
