package java_20210511.step5;

public class StopMicroWatch extends StopWatch {
	public void start() {
		startTime = System.nanoTime();
	}
	public void stop() {
		endTime = System.nanoTime();
	}
	public double getElaspsedTime() {
		return (double) (endTime - startTime) / 1000000;
	}
	public void execute() {
		start();
		for (int i = 0; i < 300_000_000l; i++) {

		}
		stop();
		double elapsedTime = getElaspsedTime();
		System.out.printf("경과시간 : %,.6f \n", elapsedTime);
	}
}
