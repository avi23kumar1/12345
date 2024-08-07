package practicesddt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Alldbs {
	public static void main(String[] args) throws SQLException {
		Driver driver= new Driver();
		DriverManager.registerDriver(driver);
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "9876");
		
   Statement stat = con.createStatement();
   int res = stat.executeUpdate("insert into project values('TY_PROJ_1004' ,'ram','01/12/2022','projevcts_038','no going',125);");
   System.out.println(res);
   
   

    con.close(); 
	}

}
