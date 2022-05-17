package ai.jobiak.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Palindrome
 */
@WebServlet("/palindrome")
public class Palindrome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Palindrome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		int num = Integer.parseInt(request.getParameter("num"));
		int r,temp;
	
		temp = num;
		int sum=0;
		
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
			
		}
		if(temp==sum) {
			out.println(num+" Is A Palindrome");
			
		}
		else {
			out.println(num+" Is Not A Palindrome");
		}
		
		
		
	}

	    	

	
	
}
