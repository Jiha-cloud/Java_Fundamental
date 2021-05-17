package java_20210517;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo1 {
	public static void m() 
			throws FileNotFoundException {
		FileReader fr = new FileReader("");
	}
	public static void m(String path) 
			throws FileNotFoundException {
		FileReader fr = new FileReader(path);
	}
	public static void main(String[] args) {
		//m();
		
		try {
			String path = args[0];
			m(path);	
		}catch(FileNotFoundException f) {
			f.printStackTrace();
			System.err.println(f.getMessage());	
			System.err.println("경로와 파일명을 정확히 입력하세요.");	
		}catch(ArrayIndexOutOfBoundsException a) {
			System.err.println("실행 시 파일명을 입력하세요.");	
			System.err.println("e.g. Run Configuration -> Arguments -> Program Arguments");	
		}
	}
}
