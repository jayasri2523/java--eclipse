package ai.jobiak.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GcdLcm
 */
@WebServlet("/gcdlcm")
public class GcdLcm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GcdLcm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		 int n1 = Integer.parseInt(request.getParameter("num1"));
		 int n2 = Integer.parseInt(request.getParameter("num2"));
		 int gcd=0,lcm;
			
		 for(int i=1;i<=n1&&i<=n2;i++) {
		  if(n1%i==0 && n2%i==0)
		   gcd = i;
		 }
		 lcm = (n1*n2)/gcd;
		 out.println("The LCM of "+n1+" and "+n2+ " is "+lcm );
		 out.println("The GCD of "+n1+" and "+n2+ " is "+gcd);

			
	}
}
