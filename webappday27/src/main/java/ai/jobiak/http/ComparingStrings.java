package ai.jobiak.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ComparingStrings
 */
@WebServlet("/compare")
public class ComparingStrings extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComparingStrings() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("str1");
		String s2 = request.getParameter("str2");
		
		
		if(s1.equals(s2)) {
			
			
			out.println(s1+" and "+s2+ " both are having same characters");
			
		}
		else {
			out.println(s1+"  and  "+s2+ "  are having different characters");
		}
		

			
		out.println("<br><br>");
		out.println("To goto mainpage <a href=index.html>Click HERE </a>");
		out.println("</center>");
			
		
		
		}

	}