<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factorial</title>
</head>

<body bgcolor="pink">


 <form name="factorial" action="factorial.jsp" method="post">
Enter a number to find the factorial:<input type="number" name="num" placeholder="123456789"><br/>
ClickHere to find factorial:<input type="submit" value="factorial"><br/>
<input type="reset" value="clean"><br/>
</form>

<hr/>
<%
String number=request.getParameter("num");
 if(number!=null){
 int n=Integer.parseInt(number); 
   int fact=1;
 for(int i=1;i<=n;i++) {
  fact*=i;
 }
 out.println("the factotrial of is="+fact);
 }
%>

<hr/>
</body>
</html>
