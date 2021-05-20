package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class TistoryScanning {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://jamesdreaming.tistory.com/99"); 
		InputStream in = url.openStream();// url 가져오고
		InputStreamReader isr = new InputStreamReader(in,"utf-8"); // url 주소의 리소스를 읽는다.
		BufferedReader br = new BufferedReader(isr); // 그걸 BufferedReader로 읽는다.
		FileWriter fw = new FileWriter("C:\\dev\\test\\2021\\05\\Tistory.html"); // 파일에 출력한다.
		BufferedWriter bw = new BufferedWriter(fw); // BufferedWriter로 출력한다.
		
		String readLine = null;
		while ((readLine = br.readLine()) != null) { // 읽는 것을 한줄씩 저장하고
			System.out.println(readLine); // 모니터에 출력하고
			bw.write(readLine); // 파일에 쓰고
			bw.newLine(); // 다음줄로
		}
		bw.flush(); // 남은거 flush
	}
}
