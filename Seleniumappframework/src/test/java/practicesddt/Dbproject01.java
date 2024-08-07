package practicesddt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class Dbproject01 {
	@Test
	public void test1() throws SQLException
	{
		String kls="avi";
		boolean flag=false;
		Driver driver= new Driver();
		DriverManager.registerDriver(driver);
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "9876");
		
   Statement stat = con.createStatement();
   ResultSet res = stat.executeQuery("select * from project");
   while(res.next())
   {
	  String act = res.getString(2);
	  if(kls.equals(act))
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
