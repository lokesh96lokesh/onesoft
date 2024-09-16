

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sample")
public class Sample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Sample() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
	
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h1>Hiii</h1>");
		out.print("</body></html>");
	
	   try {
		Connection	 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/loan", "root", "root");//Establishing connection
		out.println("Connected With the database successfully");

		PreparedStatement preparedStatement=connection.prepareStatement("select * from loan");

		ResultSet resultSet=preparedStatement.executeQuery();
     while(resultSet.next()){
          String customer_name=resultSet.getString("customer_name");
          Integer loan_amount=resultSet.getInt("loan_amount");
          Integer loan_number=resultSet.getInt("loan_number");
         
          
          out.print("<table border=1 align=center >");
         out.print( "<tr><th >"+"Customer Name"+"</th><th>"+"Loan Anmount"+"</th><th>"+"Loan Number"+"</th></tr>"+"<bgcolor=grey>");
          out.print("<tr><td>" + customer_name + "</td>"+"<td>" + loan_amount+ "</td>"+"<td>" + loan_number+ "</td></tr>");
          out.print("</table>");
         
     }
     
     
		
		
	} catch (SQLException e) {
		
		System.out.println("Error while connecting to the database");
	
			}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response ) throws  ServletException, IOException {
		doGet( request, response);
	}

}
