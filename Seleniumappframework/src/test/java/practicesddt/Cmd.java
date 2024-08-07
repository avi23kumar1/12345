package practicesddt;

import org.testng.annotations.Test;

public class Cmd {
@Test
public void seleniumtest()
{
	System.out.println("test ng test");
	 String e2 = System.getProperty("url");
	 String e3 = System.getProperty("browser");
	String e4 = System.getProperty("username");
	String e5 = System.getProperty("password");
	System.out.println("env data==> ==>"+e2);
	System.out.println("env data==> ==>"+e3);
	System.out.println("env data==> ==>"+e4);
	System.out.println("env data==> ==>"+e5);
	 
}
}
