package java_20210517;

public class TryCatchDemo {
	public static double getAvgs(int k, int e) {
		int sum = k + e;
		double avg = (double) sum / 2;
		return avg;
	}

	// javac TryCatchDemo.java = >compile
	// java TryCatchDemo 10 20 30
	// Run Configurations => Arguments => Program Arguments
	// 10 20 -> NumberFormatException
	// 10 -> ArrayIndexOutOfBoundsException
	public static void main(String[] args) {
		try {
			int korean = Integer.parseInt(args[0]);
			int english = Integer.parseInt(args[1]);

			double average = getAvgs(korean, english);
			System.out.printf("국어와 영어의 평균 점수는 %.1f\n", average);
		} catch (NumberFormatException e) {
			// catch 블럭의 수행문을 만들때 2가지 형태로 코딩한다.
			// 1. Error 메세지를 출력(개발자) - 개발단계
			// 2. Error 메세지를 출력(사용자) - 서비스단계
			// e.printStackTrace(); // 에러 메세지 전체, 개발자용
			System.err.println(e.getMessage()); // 개발자용
			System.err.println("숫자 인자가 필요합니다."); // 사용자용
		} catch (ArrayIndexOutOfBoundsException e) {
			// e.printStackTrace(); // 에러 메세지 전체
			System.err.println(e.getMessage()); // 개발자용
			System.err.println("인자 2개가 필요합니다."); // 사용자용
		} finally {
			System.out.println("무조건 수행되는 블럭 - finally");
		}
	}
}
