package ai.jobiak.shoppingCart;

import java.sql.Statement;

import java.io.IOException;
import java.io.ObjectInputFilter.Config;
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
@WebServlet("/cart4")
public class ShoppingCart4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingCart4() {
        super();
        // TODO Auto-generated constructor stub
    }

	private ArrayList<Product> getProducts() {
    String userName="root";
	String password="admin";
	String url="jdbc:mysql://localhost:3306/world";
	//String productIds[]=new String[10];
	ArrayList<Product>productList=new ArrayList<>();
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con=DriverManager.getConnection(url,userName,password);
		    Statement st=con.createStatement();
		    //String sql="Select ProductId from Products";
		    String sql="Select * from Products";
		    
		    ResultSet rs=st.executeQuery(sql);
		    
		    while(rs.next()) {
		    	Product p=new Product(rs.getString(1),rs.getString(2),rs.getDouble(3));
		    	productList.add(p);
		    
		    	}
		    
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(con!=null) 
			{
				try {
					con.close();
				} catch(SQLException e) {
					e.printStackTrace();
			}
		}
		}
		return productList;
}


 
    
    
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();//.append("Served at: ").append(request.getContextPath());
	    response.setContentType("text/html");
	    ArrayList<Product> itemsList=null;
	    itemsList=getProducts();
	    out.println("<hr/>");
	 
	    for(int i=0;i<itemsList.size();i++)
	    {
	    out.println("<a href='cart4?item="+itemsList.get(i).getProductId()+"'>Add Item"+itemsList.get(i).getProductId()+"</a><br/>");
	    }
	  
	    out.println("<hr/>");
	    
	    HttpSession shoppingCart=request.getSession();
	    
	    ArrayList<Product> selecteditemsList=null;
	 
	    
	    
	    if(shoppingCart.isNew()) {
	    	selecteditemsList=new ArrayList<>();
	    	//selecteditemsList=new ArrayList<>();
	    	
	    	shoppingCart.setAttribute("items",selecteditemsList);
	    
	    } else {
	    	String queryStr=request.getQueryString();
	    	String splitArray[]=queryStr.split("=");
	    	String productId=splitArray[1];
	    	
	    	for(int i=0;i<itemsList.size();i++) {
	    		
	    		if(itemsList.get(i).getProductId().equals(productId)) {
	    			selecteditemsList=(ArrayList<Product>)shoppingCart.getAttribute("items");
	    			selecteditemsList.add(itemsList.get(i));
	    			shoppingCart.setAttribute("items",selecteditemsList);
	    	        break;
	    		
	    		}
	    	}
	    
	    }  
	    /*	itemsList=(ArrayList<Product>) shoppingCart.getAttribute("items");
	    	Product p=new Product("AFJ101tR","XHW5 QuadCopter",5375.00);
	    	itemsList.add(new Product(productId,"ABC",78.00));
	    	for(Product product:selecteditemsList)
	    	shoppingCart.setAttribute("items",itemsList);  
	    }*/
	    	for(Product product:selecteditemsList) {
	    		
	    		//out.println("Description:<h3>" +product.getDescription()+"<h3>"); 
	    	      out.println(product.getProductId()+"::"+product.getDescription()+"::"+product.getPrice()+"<br/>");
	    	    //  out.println("<h3>Items in the cart #"+itemsList.size()+"<br/>");
	    	
	    	}
	    	out.println("<hr/>");
	    	out.println("<h3>Items in the cart #"+selecteditemsList.size());//+"<br/>");
	    
	    
	
	    
	
	}

}
