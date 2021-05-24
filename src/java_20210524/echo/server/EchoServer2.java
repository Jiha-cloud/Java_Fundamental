package java_20210524.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer2 {
	private int port;

	public EchoServer2(int port) {
		this.port = port;
	}

	public void run() throws IOException {
		ServerSocket serverSocket = null;
		EchoServerThread est = null;

		serverSocket = new ServerSocket(port);
		// TODO Auto-generated catch block
		System.out.println("\t[서버 화면]");
		System.out.println();
		while (true) {
			System.out.println("클라이언트 접속을 기다리고 있습니다...");
			// 클라이언트 접속을 기다린다.
			// accept() : 클라이언트 접속을 기다리다 클라이언트가
			// 접속하면 클라이언트와 통신할 수 있는 Socket 객체를 생성해준다.
			Socket socket = serverSocket.accept();

			est = new EchoServerThread(socket);
			Thread t = new Thread(est);
			t.start();

			// 4. 클라이언트와 통신할 수 있는 Socket객체가 생성된다.

		}
	}

	public static void main(String[] args) throws IOException {

		// EchoServer echoServer = new EchoServer(3000);
		// echoServer.run();
		// 재활용 할 일이 없을 땐 이렇게 해도 됨.
		new EchoServer2(3000).run(); // 새로운 인스턴스를 생성해서 인스턴스 내 메서드 실행.
	}
}
