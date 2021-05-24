package java_20210524.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class EchoServerThread implements Runnable {
	private Socket socket;

	public EchoServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;

		InetAddress i = socket.getInetAddress();
		System.out.println("클라이언트가 접속했습니다.");
		// 5. Socket을 이용해서 클라이언트와 통신할 수 있는 입출력 스트림 생성
		try {
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();

			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);

			while (true) { // 통신 무한루프
				String readLine = br.readLine();
				System.out.println("클라이언트 메세지 : " + readLine);

				bw.write(readLine);
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			System.out.println("클라이언트가 비정상적으로 종료되었습니다.");
		}
	}
}
