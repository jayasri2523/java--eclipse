package ai.jobiak.SignupAttributes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadSignup
 */
@WebServlet("/readSignup")
public class ReadSignup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadSignup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();//.append("Served at: ").append(request.getContextPath());
		ServletContext context=getServletContext();
		out.println("name:"+context.getAttribute("fName"));
		out.println("email"+context.getAttribute("email"));
		out.println("mobile"+context.getAttribute("mobile"));
		
		out.println("name:"+request.getAttribute("fname"));
		out.println("email:"+request.getAttribute("email"));
		out.println("mobile:"+request.getAttribute("mobile"));
		
		
	}
	

}
