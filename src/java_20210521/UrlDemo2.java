package java_20210521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlDemo2 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://news.v.daum.net/v/20210521145605233");
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort(); // 포트가 없으면 -1반환
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();
		
		System.out.println("protocol: "+ protocol);
		System.out.println("host: "+ host);
		System.out.println("port: "+ port);
		System.out.println("path: "+ path);
		System.out.println("query: "+ query);
		System.out.println("reference: "+ ref);
		
		InputStream is = url.openStream(); // source: HTML
		/*
		 * int readByteCount = 0; byte[] readBytes = new byte[1024*10]; FileOutputStream
		 * fos = new FileOutputStream("C:\\Users\\user\\Downloads\\img.jpg");
		 * 
		 * while((readByteCount = is.read(readBytes)) != -1) {
		 * fos.write(readBytes,0,readByteCount); } System.out.println("추출 성공");
		 * fos.close();
		 */
		
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		while((readLine = br.readLine()) != null) {
			System.out.println(readLine);
		}
	}
}
