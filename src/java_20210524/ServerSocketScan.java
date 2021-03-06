package java_20210524;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketScan {
public static void main(String[] args) {
	ServerSocket serverSocket = null;
	for(int port=1;port<65536;port++) {
		try {
			// ServerSocket 클래스는 해당 서버의 port 번호를 사용할 수 있으면
			// ServerSocket 인스턴스를 생성할 수 있고,
			// 그렇지 않으면 예외를 발생시킨다.
			// 즉, 예외가 발생하면 해당 port를 사용중이라는 뜻
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println(port + " 번호가 사용중이다.");
		}
	}
}
}
