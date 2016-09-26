import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;

public class ConnectDB {
	public void Connect()
	{
		
		String userName="thanh";
		String passWord="thanh";
		String con="jdbc:sqlserver://localhost:1434;databaseName=Thanh";
		String sql="select ho,ten from DSach";
		ArrayList columnNames= new ArrayList();
		ArrayList data=new ArrayList();
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection connection = DriverManager.getConnection(con,userName,passWord);
			Statement stm=connection.createStatement();
			ResultSet rs = stm.executeQuery(sql);
		}
		catch(SQLException io){
				System.out.println(io.getMessage()+"kghkhgkgkj");
		}
		catch(ClassNotFoundException e){
				e.printStackTrace();
			}
		}
}
