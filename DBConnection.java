
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	
	public static void main(String[] args)
	
	{
		try{  
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection("jdbc:sqlserver://10.247.208.73:1402;DatabaseName=Casino","sa","!@#$%A1"); 
			 if (conn != null) {
			        System.out.println("Connected to database!");
			    } else {
			        System.out.println("Failed to make connection!");
			    }
			Statement stmt = conn.createStatement();
			 String query = "select * from tb_UserAccount where loginName='leenab'";


ResultSet rs=stmt.executeQuery(query);  
	
			
			  while (rs.next()) {
			  String username = rs.getString("LoginName");
			  System.out.println(username);
			  }
			}catch(Exception e){ System.out.println(e);}  
			}  

	}


