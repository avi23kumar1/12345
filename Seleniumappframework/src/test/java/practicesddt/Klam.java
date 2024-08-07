package practicesddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Klam {

	public static void main(String[] args) throws Throwable  {
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\new1\\Book2.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet k2 = wb.getSheet("Sheet1");
		Row k3 = k2.getRow(1);
		Cell k4 = k3.getCell(0);
		String k5 = k4.getStringCellValue();
		System.out.println(k5);
	}
}
