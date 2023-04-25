package Practice;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;



public class Jdbc_connector
{
	@Test
	public void  database() throws Exception
	{

		Driver d=new Driver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
		
		Statement state = con.createStatement();
		ResultSet q = state.executeQuery("select * from sys_config");
		while(q.next())
		{
			String data =q.getString(1)+" "+q.getString(2)+" "+q.getString(3)+" "+q.getString(4);
			System.out.println(data);
			
		}
		con.close();
	}
}
