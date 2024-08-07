package createtest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Classdataprovide {

	@Test(dataProvider = "getdata1")
	public void createcontactdata(String firstname,String lastname,long  number)
	{
		System.out.println("firstname"+firstname+",lastname"+lastname+",number"+number);
	}
	@DataProvider
	public Object[][] getdata1()
	{
		Object[][] object=new Object[3][3];
		
		object[0][0]="avinash";
		object[0][1]="hr";
		object[0][2]=7019316868l;
		
		
		object[1][0]="avi";
		object[1][1]="sh";
		object[1][2]=8951237735l;
		
		object[2][0]="avinash";
		object[2][1]="smith";
		object[2][2]=7026855244l;
		
		
		return object;
	
		
	}
}
