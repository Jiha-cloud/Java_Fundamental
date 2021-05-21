package java_20210521;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

// jar download => https://www.apache.org/dyn/closer.lua/poi/release/bin/poi-bin-4.1.0-20190412.zip
// 다운 받은 후 압축 해제 후 Build path -> library 에서 jar 추가
public class ExcelDemo {
	public static void main(String[] args) {
		// 새 액셀파일 생성
		HSSFWorkbook workBook = new HSSFWorkbook();
		// 새 시트 생성
		HSSFSheet sheet = workBook.createSheet("새파일");
		// 행(row) 생성
		HSSFRow row = sheet.createRow(0);
		// cell 생성
		HSSFCell cell = row.createCell(0);	
		cell.setCellValue("테스트 데이터(0,0)");
		cell = row.createCell(1);
		cell.setCellValue("테스트 데이터(0,1)");
		cell = row.createCell(1);
		cell.setCellValue("테스트 데이터(0,2)");
		
		row = sheet.createRow(1);
		cell = row.createCell(0);
		cell.setCellValue("테스트 데이터(1,0)");
		cell = row.createCell(1);
		cell.setCellValue("테스트 데이터(1,1)");
		cell = row.createCell(2);
		cell.setCellValue("테스트 데이터(1,2)");
		
		row = sheet.createRow(2);
		cell = row.createCell(0);
		cell.setCellValue("테스트 데이터(2,0)");
		cell = row.createCell(1);
		cell.setCellValue("테스트 데이터(2,1)");
		cell = row.createCell(2);
		cell.setCellValue("테스트 데이터(2,2)");
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("C:\\Users\\user\\Downloads\\test.xls");
			workBook.write(fos);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(fos != null) fos.close();
					if(workBook != null) workBook.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
