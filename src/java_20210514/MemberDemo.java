package java_20210514;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberManager m = new MemberManager();
		m.insert("id1", "최훈", 25);
		m.insert("id2", "김철수", 26);
		m.insert("id3", "박영희", 27);
		m.insert("id4", "이민지", 24);
		
		ArrayList list = m.select();
		m.check(list);
		
		m.delete("id2");
		
		m.check(list);
		
		m.update("id2", "김철수", 26);
		m.update("id5", "유재석", 48);
		m.update("id3", "박명수", 51);
		
		m.check(list);
		
		Member m2 = m.select("id5");
		System.out.printf("%s %s %d \n",m2.getId(), m2.getName(), m2.getAge());
	}
}
