package java_20210513;
import java.util.HashSet;
import java.util.Iterator;
public class SetDemo {
	public static void main(String[] args) {
		// HashSet 클래스는 데이터(객체)의 중복을 허용하지 않고, 순서가 없음
		HashSet set = new HashSet();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("11");
		set.add("43");
		set.add("5");
		set.add("6");
		set.add("19");
		
		// HashSet 클래스는 자체적으로 출력할 방법이 없음.
		// HashSet을 Iterator로 변환해서 출력해야 함.
		Iterator i = set.iterator();
		// hasNext() : Iterator에 출력할 객체가 존재하는지 판단하는 메서드
		// 있으면 true, 없으면 false
		while(i.hasNext()) { 
			String temp	= (String)i.next();
			System.out.println(temp);
		}
	}
}
