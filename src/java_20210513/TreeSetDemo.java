package java_20210513;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.HashSet;
public class TreeSetDemo {
	public static void main(String[] args) {
		// TreeSet 클래스는 데이터(객체)의 중복을 허용하지 않고,
		// natural ordering(숫자일 때와 문자일 때 정렬방식이 다르다)을 한다.
		TreeSet set = new TreeSet();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("13");
		set.add("43");
		set.add("5");
		set.add("6");
		set.add("19");

		Iterator i = set.iterator();
		while (i.hasNext()) {
			String temp = (String) i.next();
			System.out.println(temp);
		}
	}
}