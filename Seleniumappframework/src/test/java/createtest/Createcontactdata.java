package createtest;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Createcontactdata {
	@Test(dataProvider = "getdata")
	public void createcontactdata(String firstname,String lastname)
	{
		System.out.println("firstname"+firstname+",lastname"+lastname);
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] object=new Object[3][2];
		
		object[0][0]="avinash";
		object[0][1]="hr";
		
		object[1][0]="avi";
		object[1][1]="sh";
		
		object[2][0]="avinash";
		object[2][1]="smith";
		
		
		return object;
	
		
	}
	

}
