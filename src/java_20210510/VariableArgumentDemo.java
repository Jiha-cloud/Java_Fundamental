package java_20210510;

public class VariableArgumentDemo {
	public long sum(int...temp)	{
		long sum = 0;
		for (int i = 0; i < temp.length; i++) {
			sum += temp[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		VariableArgumentDemo vararg = new VariableArgumentDemo();
		long s1 = vararg.sum(10,20);
		System.out.println(s1);
		s1 = vararg.sum(80,80,75,95);
		System.out.println(s1);
	}
}
