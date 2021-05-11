package java_20210511.step3;


public class StopWatchDemo {
	
	public static void main(String[] args) {
		StopMWatch s = new StopMWatch();
		s.start();
		for (int i = 0; i < 300_000_000l; i++) {

		}
		s.stop();
		double elapsedTime = s.getElaspsedTime();
		System.out.printf("경과시간 : %,.3f \n", elapsedTime); // 3이랑 9 바꿔줘야됨
	}
}
