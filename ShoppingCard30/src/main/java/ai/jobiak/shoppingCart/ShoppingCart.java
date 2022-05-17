package ai.jobiak.shoppingCart;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShoppingCart
 */
@WebServlet("/cart")
public class ShoppingCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();//.append("Served at: ").append(request.getContextPath());
	    response.setContentType("text/html");
	    for(int i=1;i<=10;i++) {
	    out.println("<a href='cart'>Add Item"+i+"</a><br/>");
	    }
	    ArrayList<Product> itemsList=null;
	 
	    HttpSession shoppingCart=request.getSession();
	    
	    if(shoppingCart.isNew()) {
	    	
	    	itemsList=new ArrayList<>();
	    	
	    	shoppingCart.setAttribute("items",itemsList);
	    
	    } else {
	    
	    	itemsList=(ArrayList<Product>) shoppingCart.getAttribute("items");
	    	Product p=new Product("AFJ101tR","XHW5 QuadCopter",5375.00);
	    	itemsList.add(p);
	    	shoppingCart.setAttribute("items",itemsList);
	    	for(Product product:itemsList) {
	    		
	    		out.println("Description:<h3>" +product.getDescription()+"<h3>"); 
	    	}
	    
	    
	
	    }
	
	}

}
