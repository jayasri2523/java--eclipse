package ai.jobiak.SignupAttributes;
import java.sql.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignupAttribute
 */
@WebServlet("/signupAttribute")
public class SignupAttribute extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupAttribute() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @throws SQLException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    
    
    private Connection connect() {
        
        String url = "jdbc:mysql://localhost:3306/world";
        String username = "root";
        String password = "admin";
        Connection con1 = null;
        
        
        try {
      Class.forName("com.mysql.cj.jdbc.Driver");
       con1 = DriverManager.getConnection(url,username,password);
         
     
     } catch (SQLException e) {
      e.printStackTrace();
     } catch (ClassNotFoundException e) {
      e.printStackTrace();
     }
     
     return con1;
        
       }

   
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 Connection con = connect();
		 Statement stmt=null;
		  ServletContext context = getServletContext();

		  try {
			  Class.forName("com.mysql.cj.jdbc.Driver");
		      
		  Statement stmt1 = con.createStatement();
		   
		  } catch (SQLException | ClassNotFoundException e ) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		  String sql = "select * from signup";
		  
		  try {
		   ResultSet rs=stmt.executeQuery(sql);
		   
		   rs.next();
		   context.setAttribute("fname", rs.getString(1));
		   context.setAttribute("email", rs.getString(2));
		   context.setAttribute("mobile", rs.getString(3));
		   
		   
		   
		   request.setAttribute("fname",rs.getString(1));
		   request.setAttribute("email",rs.getString(2));

		   request.setAttribute("mobile",rs.getString(3));


		   
		  } catch (SQLException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		  
	}
}
