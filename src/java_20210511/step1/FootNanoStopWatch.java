package java_20210511.step1;
// 요구사항 : 나노 세컨드로 경과 시간을 만들어 주세요. 
public class FootNanoStopWatch {
	long startTime;
	long endTime;
	public double getElaspsedTime() {
		return (double) (endTime - startTime) / 1000000000;
	}
	public static void main(String[] args) {
		FootNanoStopWatch f = new FootNanoStopWatch();
		f.startTime = System.nanoTime();
		for (int i = 0; i < 300_000_000l; i++) {

		}
		f.endTime = System.nanoTime();
		double elapsedTime = f.getElaspsedTime();
		System.out.printf("경과시간 : %,.9f \n", elapsedTime);
	}
}
