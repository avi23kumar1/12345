package practicesddt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import com.mysql.jdbc.Driver;

public class Mysqltest {

	public static void main(String[] args) throws SQLException {
	Driver driver= new Driver();
		DriverManager.registerDriver(driver);
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "9876");
		
   Statement stat = con.createStatement();
   ResultSet res = stat.executeQuery("select * from project");
   
   
res.next();
String k2 = res.getString(1);
System.out.println(k2);
    con.close();
     
	}

}
