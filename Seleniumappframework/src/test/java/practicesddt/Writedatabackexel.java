package practicesddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writedatabackexel {
public static void main(String[] args) throws Throwable {
FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\new1\\Book2.xlsx");
	
	Workbook wb = WorkbookFactory.create(fis);
	Sheet k2 = wb.getSheet("Sheet1");
	Cell i2 = k2.getRow(1).createCell(4);
	i2.setCellType(CellType.STRING);
	i2.setCellValue("value");
	FileOutputStream ksm=new FileOutputStream("C:\\Users\\HP\\Desktop\\new1\\Book2.xlsx");
	wb.write(ksm);
	wb.close();
	System.out.println("print");
}
}
