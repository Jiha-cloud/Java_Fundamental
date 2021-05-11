package java_20210511;

public class SubDemo {
	public static void main(String[] args) {
		Sub s = new Sub();
		System.out.println(s.money);
		s.makeMoney();
		System.out.println(s.chicken);
		s.goToSchool();
		s.play("~~~");
		
		Super sup = new Super();
		System.out.println(sup.money);
		sup.makeMoney();
		sup.play("~~");
		
		Super sup1 = new Sub();
		System.out.println(sup1.money);
		sup1.makeMoney();
		sup1.play("~~");
		
		System.out.println(s.toString());
		System.out.println(s);
		
		Object obj = new Object();
		System.out.println(obj.toString());
	}
}
