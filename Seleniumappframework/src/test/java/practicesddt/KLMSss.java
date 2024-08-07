package practicesddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class KLMSss {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\new1\\Book2.xlsx");
	
	Workbook wb = WorkbookFactory.create(fis);
	Sheet k2 = wb.getSheet("Sheet1");
	int count = k2.getLastRowNum();
	
	for(int i=0;i<count;i++)
	{
		Row k3 = k2.getRow(i);
		 String k9 = k3.getCell(0).toString();
		 String k10 = k3.getCell(1).toString();
		 System.out.println(k9+" "+k10);
	}
	
	
}
}
