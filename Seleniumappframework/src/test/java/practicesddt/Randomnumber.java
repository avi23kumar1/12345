package practicesddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;

import org.apache.commons.math3.genetics.RandomKeyMutation;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Randomnumber {

	public static void main(String[] args) throws Throwable {
	Random rm=new Random();
	int k2 = rm.nextInt(1000);
FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\new1\\Book2.xlsx");
	
	Workbook wb = WorkbookFactory.create(fis);
	Sheet k3 = wb.getSheet("Sheet1");
	int count = k3.getLastRowNum();
	
	for(int i=0;i<count;i++)
	{
		Row k4 = k3.getRow(i);
		 String k9 = k4.getCell(0).toString()+k2;
		 String k10 = k4.getCell(1).toString()+k2;
		 System.out.println(k9+" "+k10);
		 
	}     

	}
}
