package java_20210511.step2;

public class StopWatch {
	long startMTime;
	long endMTime;
	
	public void start() {
		startMTime = System.currentTimeMillis();
	}
	public void stop() {
		endMTime = System.currentTimeMillis();
	}
	public double getElaspsedMTime() {
		return (double) (endMTime - startMTime) / 1000;
	}

	long startNTime;
	long endNTime;
	
	public void startNano() {
		startNTime = System.nanoTime();
	}
	public void stopNano() {
		endNTime = System.nanoTime();
	}

	public double getElaspsedNTime() {
		return (double) (endNTime - startNTime) / 1000000000;
	}
}
