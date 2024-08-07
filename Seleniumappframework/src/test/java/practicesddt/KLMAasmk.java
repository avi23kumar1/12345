package practicesddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class KLMAasmk {
	public static void main(String[] args) throws Throwable {
		
		String s2="tc_01";
		String data1="";
		String data2="";
		boolean flag=false;
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\new1\\Book2.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet k2 = wb.getSheet("Sheet1");
		int count = k2.getLastRowNum();
		for(int i=1;i<=count;i++)
		{
			String data="";
			try {

				 data = k2.getRow(i).getCell(0).toString();
				 if(data.equals(s2))
				 {
					 flag=true;
					 data1 = k2.getRow(i).getCell(1).toString();
					 data2= k2.getRow(i).getCell(2).toString();
				 }
				
				
			} catch (Exception e) {}	
		}
		if(flag==true)
		{
			System.out.println(data1);
			System.out.println(data2);
		}
		else
		{
			System.out.println("data is not found");
			
		}
		
				
		
	}
	}

