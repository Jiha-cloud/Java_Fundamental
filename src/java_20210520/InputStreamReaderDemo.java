package java_20210520;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in; // source가 키보드인 경우
		byte[] b = new byte[100];
		/*
		 * int readByteCount = 0; System.out.print("입력하세요> "); while ((readByteCount =
		 * in.read(b)) != -1) { System.out.print(new String(b,0,readByteCount)); //
		 * console창에서 enter키를 쳐야만 실행됨.n print에 개행이 포함되어 있음. System.out.print("입력하세요> ");
		 */

		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		System.out.println("입력하세요>");
		while ((readLine = br.readLine()) != null) {
			if (readLine != null && readLine.equals("quit"))
				break;
			System.out.println(readLine);
			System.out.println("입력하세요>");
		}
	}
}
