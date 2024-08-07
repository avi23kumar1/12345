package practicesddt;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class Xmltest {
	@Test
	public void test1(XmlTest test)
	{
		System.out.println("tested");
		System.out.println(test.getParameter("browser"));
		System.out.println(test.getParameter("url"));
		System.out.println(test.getParameter("username"));
		System.out.println(test.getParameter("password"));
		
		
	}

}
