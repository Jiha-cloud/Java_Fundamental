package java_20210520;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		PrintStream ps1 = null;

		ps1 = System.out; // 모니터에 출력
		ps1.println("Hello");
		ps1.println("안녕하세요");
		
		
		fis = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\eclips.zip");
		bis = new BufferedInputStream(fis);	
		
		fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\eclips-copy.zip");
		bos = new BufferedOutputStream(fos);
		
		// PrintStream
		// 1. PrintStream의 메서드는 IOException이 발생하지 않는다.
		// 2. auto flush 기능을 가지고 있다.
		ps = new PrintStream(bos,true); // 두 번째 boolean은 auto flush 여부

		int readByte = 0;
		
			while((readByte = bis.read()) != -1) {
				ps.write(readByte);
				//ps.flush(); 필요없음 
			}
		
		
	}
}
