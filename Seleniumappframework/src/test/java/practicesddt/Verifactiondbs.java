package practicesddt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.jdbc.Driver;

public class Verifactiondbs {

	public static void main(String[] args) throws SQLException {
		String projectname="instagram_225";
		WebDriver driver=new ChromeDriver();
		driver.get("http://106.51.90.215:8084/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		driver.findElement(By.linkText("Projects")).click();
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		driver.findElement(By.name("projectName")).sendKeys(projectname);
		driver.findElement(By.name("createdBy")).sendKeys("deepak");
		Select sel=new Select(driver.findElement(By.name("status")));
		sel.selectByVisibleText("Created");
		driver.findElement(By.xpath("//input[@value='Add Project']")).click();
		
		
	
		boolean flag=false;
		Driver driver1= new Driver();
		DriverManager.registerDriver(driver1);
		  Connection con = DriverManager.getConnection("jdbc:mysql://106.51.90.215:3333/projects", "root@%", "root");
		
   Statement stat = con.createStatement();
   ResultSet res = stat.executeQuery("select * from project");
   while(res.next())
   {
	  String act = res.getString(4);
	  if(projectname.equals(act))
	  {
		  flag=true;
		  System.out.println("correct");
	  }
   }
   
if(flag==false)
{
	System.out.println("false");
}
    con.close();
		
		
		
		
	}

}
