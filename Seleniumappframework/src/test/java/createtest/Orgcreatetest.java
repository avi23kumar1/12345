package createtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Orgcreatetest {
	@Test
	public void test() throws Throwable
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\commondatass.properties");
		Properties pobj= new Properties();
		pobj.load(fis);
		 String q1 = pobj.getProperty("browser");
		 String q2 = pobj.getProperty("url");
		String q3=pobj.getProperty("password");
		
		String q4 = pobj.getProperty("username"); 
		Random rm=new Random();
		int k2 = rm.nextInt(1000);
	FileInputStream fys=new FileInputStream("C:\\Users\\HP\\Desktop\\new1\\Book2.xlsx");
		
		Workbook wb = WorkbookFactory.create(fys);
		Sheet k3 = wb.getSheet("Sheet1");
	
		Row k4 = k3.getRow(0);
			 
			 String k10 = k4.getCell(1).toString()+k2;
			 String k11 = k4.getCell(2).toString()+k2;
			  
		WebDriver driver=null;
		if(q1.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(q1.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(q1.equals("edge"))
				{
			driver=new EdgeDriver();
				}
		else
		{
			driver=new ChromeDriver();
		}
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(q2);
		 driver.findElement(By.name("user_name")).sendKeys(q4);
		 driver.findElement(By.name("user_password")).sendKeys(q3);
		 driver.findElement(By.id("submitButton")).click();
		 
		 driver.findElement(By.linkText("Organizations")).click();
		 driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		 driver.findElement(By.name("accountname")).sendKeys(k10);
		 driver.findElement(By.name("button")).click();
		 Thread.sleep(5000);
		 
		 
		 driver.findElement(By.linkText("Contacts")).click();
		 driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		 driver.findElement(By.name("lastname")).sendKeys(k11);
		 driver.findElement(By.xpath("//input[@name='account_name']/following-sibling::img")).click();
		    Set<String> s = driver.getWindowHandles();
		    Iterator<String> it = s.iterator();
		    while(it.hasNext())
		    {
		    	String windowid = it.next();
		    	driver.switchTo().window(windowid);
		    	String wurl = driver.getCurrentUrl();
		    	if(wurl.contains("module=Accounts"))
		    	{
		    		break;
		    	}
		    	
		    }
		 
		 
		 driver.findElement(By.id("search_txt")).sendKeys(k10);
		 driver.findElement(By.name("search")).click();
		 driver.findElement(By.xpath("//a[text()='"+k10+"']")).click();
		 
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> it1 = s1.iterator();
		while(it1.hasNext())
		{
			String windowid1 = it1.next();
			driver.switchTo().window(windowid1);
			String wurl1 = driver.getCurrentUrl();
			if(wurl1.contains("Contacts&action"))
			{
				break;
			}
		}
		  
		 driver.findElement(By.name("button")).click();
		 
		 String l2 = driver.findElement(By.id("dtlview_Last Name")).getText();
			
			
			
			if(l2.contains(k11))
			{
				System.out.println("test is pass");
			}
			else
			{
				System.out.println("test is fail");
			}
			 String a1 = driver.findElement(By.id("mouseArea_Organization Name")).getText();
			 if(a1.contains(k10))
			 {
				 System.out.println("test is pass");
			 }
			 else 
			 {
				 System.out.println("test is fail");
			 }
			
			
			
			 driver.close();
		 
		 
		 
		 
		 
	}

}
