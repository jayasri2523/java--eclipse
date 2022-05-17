package ai.jobiak.attributes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateAttributes
 */
@WebServlet("/attributes")
public class CreateAttributes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAttributes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();//.append("Served at: ").append(request.getContextPath());
	    ServletContext context=getServletContext();
	    context.setAttribute("dbName","mySQL");
	    context.setAttribute("dbVersion","8.0.28");
	    
	    request.setAttribute("jdk", "17.0.2");//these req attributes will be alive till the req is in progress
	    request.setAttribute("OS", "Windows 10");//they are lost once the response is sent to client
	    
	    
	    RequestDispatcher dispatcher=context.getRequestDispatcher("/readattributes");
	    dispatcher.forward(request, response);
	    
	}
}
		
		
		
		
		
