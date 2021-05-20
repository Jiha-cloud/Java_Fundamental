package java_20210520;

import java.io.IOException;
import java.io.InputStream;
import java.net.MulticastSocket;

public class InputStreamReaderDemo2 {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in; // source가 키보드인 경우
		byte[] b = new byte[100];
		int readByteCount = 0;
		System.out.print("입력하세요> ");
		while ((readByteCount = in.read(b)) != -1) {
			String message = new String(b,0,readByteCount);
			if (message != null & message.trim().equals("quit")) break;
			System.out.print(message);
			System.out.print("입력하세요> ");
		}
	}
}