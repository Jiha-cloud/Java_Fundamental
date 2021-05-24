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

public class EchoServer {
	private int port;

	public EchoServer(int port) {
		this.port = port;
	}

	public void run() throws IOException {
		ServerSocket serverSocket = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;

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
			// 4. 클라이언트와 통신할 수 있는 Socket객체가 생성된다.
			InetAddress i = socket.getInetAddress();
			System.out.println("클라이언트가 접속했습니다.");
			// 5. Socket을 이용해서 클라이언트와 통신할 수 있는 입출력 스트림 생성
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();

			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			
			while(true) { // 통신 무한루프
			String readLine = br.readLine();
			System.out.println("클라이언트 메세지 : " + readLine);
			
			bw.write(readLine);
			bw.newLine();
			bw.flush();
			}
		}
	}

	public static void main(String[] args) throws IOException {

		// EchoServer echoServer = new EchoServer(3000);
		// echoServer.run();
		// 재활용 할 일이 없을 땐 이렇게 해도 됨.
		new EchoServer(3000).run(); // 새로운 인스턴스를 생성해서 인스턴스 내 메서드 실행.
	}
}
