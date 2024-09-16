package excelFile;

import java.sql.*;

public class Dbconnect {

	public static void main(String[] args)  {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/loan", "root", "root");//Establishing connection
			System.out.println("Connected With the database successfully");
			/*PreparedStatement preparedStatement=connection.prepareStatement("insert into loan values(?,?,?)");
			 
			 //Setting values for Each Parameter
			 preparedStatement.setString(1,"1");
	         preparedStatement.setString(2,"Mehtab");
	         preparedStatement.setString(3, "Computer");
	         
	         //Executing Query
	         preparedStatement.executeUpdate();
	         System.out.println("data inserted successfully");*/
		} catch (SQLException e) {
			
			System.out.println("Error while connecting to the database");
		
				}
		}
	
			
		}
	


	

