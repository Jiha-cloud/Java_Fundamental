package java_20210517;

public class ThreadDemo extends Thread{

	public ThreadDemo(String threadName) {
		super(threadName);
		// TODO Auto-generated constructor stub
	}
	public void run() {
		for (int i = 0; i < 1000; i++) {
			String threadName = Thread.currentThread().getName();
		System.out.printf("%s : %d\n",threadName, i);
		}
	}
	public static void main(String[] args) {
		System.out.println("===================start=======================");
		// Thread 클래스를 만드는 법
		// 1. Thread 클래스를 상속받는다.
		// 2. run() 오버라이딩 한다.
		// 3. 스레드를 상속받은 객체를 생성한다.
		// 4. 객체가 생성되었다면 start() 메서드를 호출한다.
		ThreadDemo t1 = new ThreadDemo("첫 번째 스레드");
		t1.start();
		
		ThreadDemo t2 = new ThreadDemo("두 번째 스레드");
		t2.start();
		
		System.out.println("====================end========================");
	}
	
}
