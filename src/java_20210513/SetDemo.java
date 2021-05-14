package java_20210513;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class SetDemo {
	public static void main(String[] args) {
		// HashSet 클래스는 데이터(객체)의 중복을 허용하지 않고, 순서가 없음
		// LinkedHashSet 클래스는 데이터의 중복을 허용하지 않고, 순서는 FIFO
		// TreeSet 클래스는 compareTo 메서드로 중복체크 => 메모리와 상관없이 저장된 문자열을 비교함.
		// equals는 메모리가 가리키는 객체를 비교함.
		LinkedHashSet set = new LinkedHashSet();
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
		StringBuffer s1 = new StringBuffer("a");
		StringBuffer s2 = new StringBuffer("a");
		// HashSet 클래스는 데이터의 중복을 판단할 때 equals()로 비교해서
		// True가 나오면 데이터가 중복되었다고 판단하여 데이터를 추가해 주지 않는다.
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equals(s2));
		HashSet set1 = new HashSet();
		set1.add(s1);
		set1.add(s2);
		
		System.out.println(set1.size());
		// TreeSet 클래스는 데이터의 중복을 판단할 때 compareTo()로 비교해서
		// 0이 나오면 데이터가 중복되었다고 판단하여 데이터를 추가해 주지 않는다.
		TreeSet set2 = new TreeSet();
		set2.add(s1);
		set2.add(s2);
		
		System.out.println(set2.size());
	}
}
