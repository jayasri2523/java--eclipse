<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fibonacci</title>
</head>
<body>
<form method="get">
<h3> Enter the number of terms you want:
<input type="text" name="limit">
</h3>
</form>
<h3>
<%
 String s = request.getParameter("limit");
 if (s != null) {
%>
<%@ page import = "java.io.*" %>
<%@ page import = "java.lang.*" %>
<%
    int n=0;
    n=Integer.parseInt(s);
   out.println("No of terms to be printed is  "+n);
%>
<br>
<br>
<br>
The series generated are listed below :<br><br>
<%
    int a=1;
    int b=1;
   out.println(""+a+",\t"+b+",\t");
  for(int i=3;i<= n;i++)
{
    int c=a+b;
   out.print(""+c+",\t");
  a=b;
 b=c;
}
}
%>
</h3>

</body>
</html>