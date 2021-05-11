package java_20210511.step3;

public class StopNWatch {
	long startTime;
	long endTime;
	
	public void start() {
		startTime = System.nanoTime();
	}
	public void stop() {
		endTime = System.nanoTime();
	}

	public double getElaspsedNTime() {
		return (double) (endTime - startTime) / 1000000000;
	}
}
