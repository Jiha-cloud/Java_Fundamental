package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

// byte => FileInputStream ==> FileOutputStream
// Character => FileReader -> BufferedReader ==> PrintStream (to monitor) or FileWriter -> BufferedWriter -> PrintWriter 
// KeyBoard => System.in ==> ....

public class InputStreamReaderDemo3 {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in; // source가 키보드인 경우
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);

		FileWriter fw = new FileWriter("C:\\dev\\test\\2021\\05\\18\\message.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);

		String readLine = null;
		System.out.print("입력하세요>");

		while ((readLine = br.readLine()) != null) {
			if (readLine != null && readLine.equals("quit"))
				break;
			System.out.println(readLine);
			bw.write(readLine);
			bw.newLine();
			System.out.print("입력하세요>");
		}
		bw.flush();
	}
}
