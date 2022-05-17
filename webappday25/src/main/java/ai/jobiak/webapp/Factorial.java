package ai.jobiak.webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Factorial implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		
		int n=5;
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		out.println("The factorial of 5 is"+fact);
		
		ArrayList<String>list=new ArrayList();
		list.add("Orange");list.add("blue");list.add("Red");
		for(String color:list) {
			out.println(color+"::"+color.length());
		}
		
		HashMap<String,String>techInventers=new HashMap();
		techInventers.put("Java","James Gosling");
		techInventers.put("C", "Dennis Ritche");
		techInventers.put("Linux", "Linus Travoid");
		
		out.println(techInventers);
		HashMap<String,String>Inventers=new HashMap();
		Inventers.put("Google", "Larray Page");
		Inventers.put("Amazon", "jeff Bezos");
		
		out.println(Inventers);
		
		
		
		Set<String>keys=Inventers.keySet();
		for(String key:keys) {
			out.println(Inventers.get(key)+"length of values"+Inventers.get(key).length());
		}
		
		
		

		

	}

}
