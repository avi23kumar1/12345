package pomtest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.beust.ah.A;

public class Simpletest {
@FindBy(name="user")
WebElement ele1;
@FindBy(name="user_password")
WebElement ele2;
@FindAll({@FindBy(id="submitButton") , @FindBy(xpath = "//input[@value=login'")})
 private  WebElement ele3;
@Test
public void simpletest()
{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://localhost:8888");
	Simpletest s = PageFactory.initElements( driver,Simpletest.class);
	
	
	  
	
	s.ele1.sendKeys("admin");
	s.ele2.sendKeys("admin");
	driver.navigate().refresh();
	s.ele1.sendKeys("admin");
	s.ele2.sendKeys("admin");
	s.ele3.click();
	
	
	
	
}




	}


