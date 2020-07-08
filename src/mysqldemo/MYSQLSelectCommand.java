package mysqldemo;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class MYSQLSelectCommand {
//JDBC Connection
	//Step 1: Create a connection to the database
	//Step 2: Create statement/query
	//Step 3: Execute statement/query
	//Step 4: Store the result in result set
	//Step 5: Close the connection
			
	public static void main(String[] args) throws SQLException {
  
		//Step 1: Create a connection to the database
		//Connection=java.sql.Connection
		java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","root");
		//Step 2: Create statement/query
		Statement stmt=conn.createStatement();
		
		//Step 3: Execute statement/query
		String s="SELECT ID,Name,CountryCode,District,Population FROM city";
		ResultSet rs=stmt.executeQuery(s);
		
		//Step 4: Store the result in result set
		while(rs.next()) {
			
			int id=rs.getInt("ID");
			String name=rs.getString("Name");
			String cc=rs.getString("CountryCode");
			String dis=rs.getString("District");
			int pop=rs.getInt("Population");
			System.out.println(id+"    "+name+"    "+cc+"     "+dis+"   "+pop);
		}
		      
		//Step 5: Close the connection
		      conn.close();
		      
		     System.out.println("Connected Sucessfully------------- Query Executed");
		

	}

}
