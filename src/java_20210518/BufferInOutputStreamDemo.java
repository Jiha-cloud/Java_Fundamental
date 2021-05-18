package java_20210518;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try { // 1. FileInputStream 과 FileOutputStream을 이용하여
				// 1바이트씩 읽어서 1바이트씩 출력한 예제
			fis = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46.zip");
			fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46-copy.zip");

			/*
			 * int readByte = 0; long start = System.currentTimeMillis(); try { while
			 * ((readByte = fis.read()) != -1) { fos.write(readByte); } long end =
			 * System.currentTimeMillis(); System.out.printf("경과시간 : %d\n", (end - start));
			 */
			// 경과시간 : 49437 ms

			// 2. BufferedInputStream과 BufferedOutputStream을
			//    이용, BufferedOutputStream의 버퍼(byte[]) 공간에
			//    가득 차있으면 출력한다. 가득 차지 않으면 출력 X
			//    이 경우, write()가 실행되지 않아 예외가 발생하므로
			//    flush()를 사용하여 모두 출력해줘야 함.
			/*bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			int readByte = 0;
			long start = System.currentTimeMillis();
			try {
				while ((readByte = bis.read()) != -1) {
					bos.write(readByte);
				}
				bos.flush(); // buffer가 다 차지 않아서 write가 이뤄지지 않았을 때 flush메서드를 이용해 보내버림.
				long end = System.currentTimeMillis();
				System.out.printf("경과시간 : %d\n", (end - start));
				
				// 경과시간 : 353ms
*/	
			int readByCount = 0;
			byte[] readBytes = new byte[1024*10];
			long start = System.currentTimeMillis();
			try {
			while((readByCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes,0,readByCount);
		}
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 : %d\n", (end - start));
			
			// 경과시간 : 39ms (이게 가장 빠름)
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
				if (bis != null)
					bis.close();
				if (bos != null)
					bos.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
