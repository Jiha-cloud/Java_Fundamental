package java_20210524.echo.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClient2 {
	private String ip;
	private int port;

	public EchoClient2(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	public String console(String msg) {
		System.out.print(msg);
		Scanner scanner = new Scanner(System.in);
		return scanner.next(); // 메세지> 'scanner.next()'
	}

	public void run() {
		Socket socket = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;

		// ip와 port로 서버에 접속을 시도한다.
		try {
			socket = new Socket(ip, port);
			System.out.println("서버와 접속이 성공했습니다...");
			// 6. Socket을 이용해서 서버와 통신할 수 있는 입출력 스트림 생성

			// 6-1
			
			OutputStream os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);

			InputStream is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);

			while (true) {
				String message = console("메세지> "); // message에다가 키보드로부터 입력받는 값을 저장
				bw.write(message);
				bw.newLine();
				bw.flush();

				String readLine = br.readLine();
				System.out.println("서버 메세지 : " + readLine);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("서버와 접속이 실패했습니다...");
		}
	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		// cmd -> ipconfig -> IPv4 주소
		new EchoClient2("192.168.0.28", 3000).run();
	}

}
