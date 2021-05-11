package java_20210511.step3;

public class StopMWatch {
	long startTime;
	long endTime;
	
	public void start() {
		startTime = System.currentTimeMillis();
	}
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	public double getElaspsedTime() {
		return (double) (endTime - startTime) / 1000;
	}

}
