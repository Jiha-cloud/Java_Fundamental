package java_20210520;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("C:\\dev\\test\\2021\\05\\18\\FileDemo.java");
			fw = new FileWriter("C:\\dev\\test\\2021\\05\\18\\FileDemo-copy.java",true); // true를 주면 지우고 쓰는게 아닌 계속 이어서 쓴다.
																					     // 즉 용량이 계속 늘어남.
			/*
			 * try { try { int readChar = 0; // read() : 한 개의 문자를 읽는다. while((readChar =
			 * fr.read()) != -1) { System.out.print((char)readChar); fw.write(readChar); //
			 * write() : 한개의 문자를 쓴다. }
			 */

			int readCharCount = 0;
			char[] readChars = new char[1024];

			while ((readCharCount = fr.read(readChars)) != -1) {
				System.out.println(readChars);
				fw.write(readChars,0,readCharCount);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					fr.close();
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
