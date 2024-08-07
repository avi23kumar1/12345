package practicesddt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class Newdbclstry {
	@Test
	public void test2() throws SQLException
	{
		Connection con=null;
		try {
			Driver driver= new Driver();
			DriverManager.registerDriver(driver);
			  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "9876");
			
	   Statement stat = con.createStatement();
	   ResultSet res = stat.executeQuery("select * from project");
	   
	   
	res.next();
	String k2 = res.getString(2);
	System.out.println(k2);
	 
			
		} catch (Exception e) {
			System.out.println("not done");
		}
		finally
		{
			con.close();
		}
	}

}
