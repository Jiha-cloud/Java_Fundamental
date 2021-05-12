package java_20210512;

public class MathDemo {
	public static void main(String[] args) {
		double a = Math.ceil(3.4);
		System.out.println(a);

		a = Math.floor(3.99);
		System.out.println(a);

		int i = Math.round(3.44f);
		long l = Math.round(3.44);

		System.out.println(i);
		System.out.println(l);

		double abs = Math.abs(-3.4);
		double min = Math.min(-2.1, 7.8);
		double max = Math.max(-4.2, 5.6);

		System.out.printf("%f %f %f", abs, min, max);
		System.out.println();

		double sqrt = Math.sqrt(9);
		double pow = Math.pow(2, 4);
		double random = Math.random();

		System.out.printf("%f %f %f", sqrt, pow, random);
	}
}
