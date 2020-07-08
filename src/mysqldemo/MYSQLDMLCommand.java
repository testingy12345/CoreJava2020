package mysqldemo;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class MYSQLDMLCommand {
//JDBC Connection
	//Step 1: Create a connection to the database
	//Step 2: Create statement/query
	//Step 3: Execute statement/query
	//Step 4: Store the result in result set
	//Step 5: Close the connection
			
	public static void main(String[] args) throws SQLException {
  
		//Step 1: Create a connection to the database
		//Connection=java.sql.Connection
		java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		//Step 2: Create statement/query
		Statement stmt=conn.createStatement();
		//For Insert the Record
		     // String s="INSERT INTO STUDENT4 VALUES(4,'A',2060)";
		//For Update the Record
		//String s="UPDATE STUDENT4 SET SNAME='VIPIN' WHERE SNO=2 ";
		//For Delete the Record
		String s="DELETE FROM STUDENT4  WHERE SNO=1";
		//Step 3: Execute statement/query
		      stmt.execute(s);
		
		//Step 4: Store the result in result set
		//Step 5: Close the connection
		      conn.close();
		      
		     System.out.println("Connected Sucessfully------------- Query Executed");
		

	}

}
