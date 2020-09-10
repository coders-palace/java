package Java_programs;

import java.sql.Connection;
import java.sql.DriverManager;
public class JdbcExp {

	final static String URL="jdbc:mysql://localhost:3306/iips";
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection(URL,"root","root");
        
		if(conn!=null)
		{
			System.out.println("Connection established with mysql");
		}
		else
		{
			System.out.println("Not Connected");
		}

	}

}
