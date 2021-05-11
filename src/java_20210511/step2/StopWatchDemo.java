package java_20210511.step2;

public class StopWatchDemo {
	public static void main(String[] args) {
		StopWatch s = new StopWatch();
		s.start();
		for (int i = 0; i < 300_000_000l; i++) {

		}
		s.stop();
		double elapsedTime = s.getElaspsedMTime();
		System.out.printf("경과시간 : %,.3f \n", elapsedTime);
	}
}
