package ai.jobiak.shoppingCart;

import java.sql.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
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
@WebServlet("/cart3")
public class ShoppingCart3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingCart3() {
        super();
        // TODO Auto-generated constructor stub
    }

	private String[] getProductIds() {
    String userName="root";
	String password="admin";
	String url="jdbc:mysql://localhost:3306/world";
	String productIds[]=new String[10];
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,userName,password);
		    Statement st=con.createStatement();
		    String sql="Select ProductId from Products";
		    ResultSet rs=st.executeQuery(sql);
		    int i=0;
		    while(rs.next()) {
		    	productIds[i]=rs.getString(1);
		    	i++;
		    	}
		    
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return productIds;
}


 
    
    
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();//.append("Served at: ").append(request.getContextPath());
	    response.setContentType("text/html");
	 
	    String productIds[]=getProductIds();
	 
	    for(int i=0;i<productIds.length;i++)
	    {
	    out.println("<a href='cart3?item="+productIds[i]+"'>Add Item"+productIds[i]+"</a><br/>");
	    }
	
	    
	    ArrayList<Product> itemsList=null;
	 
	    HttpSession shoppingCart=request.getSession();
	    
	    if(shoppingCart.isNew()) {
	    	
	    	itemsList=new ArrayList<>();
	    	
	    	shoppingCart.setAttribute("items",itemsList);
	    
	    } else {
	    	String queryStr=request.getQueryString();
	    	String splitArray[]=queryStr.split("=");
	    	String productId=splitArray[1];
	    
	    	itemsList=(ArrayList<Product>) shoppingCart.getAttribute("items");
	    	//Product p=new Product("AFJ101tR","XHW5 QuadCopter",5375.00);
	    	itemsList.add(new Product(productId,"ABC",78.00));
	    	shoppingCart.setAttribute("items",itemsList);
	    }
	    	for(Product product:itemsList) {
	    		
	    		//out.println("Description:<h3>" +product.getDescription()+"<h3>"); 
	    	      out.println(product.getProductId()+"::"+product.getDescription()+"::"+product.getPrice()+"<br>");
	    	    //  out.println("<h3>Items in the cart #"+itemsList.size()+"<br/>");
	    	
	    	}
	    	out.println("<h3>Items in the cart #"+itemsList.size()+"<br/>");
	    
	    
	
	    
	
	}

}
