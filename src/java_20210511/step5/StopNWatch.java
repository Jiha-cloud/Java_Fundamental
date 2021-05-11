package java_20210511.step5;

public class StopNWatch extends StopWatch {
	public void start() {
		startTime = System.nanoTime();
	}
	public void stop() {
		endTime = System.nanoTime();
	}

	public double getElaspsedNTime() {
		return (double) (endTime - startTime) / 1000000000;
	}
	public void execute() {
		start();
		for (int i = 0; i < 300_000_000l; i++) {

		}
		stop();
		double elapsedTime = getElaspsedNTime();
		System.out.printf("경과시간 : %,.9f \n", elapsedTime);
	}
}
