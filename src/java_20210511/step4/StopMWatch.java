package java_20210511.step4;

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
