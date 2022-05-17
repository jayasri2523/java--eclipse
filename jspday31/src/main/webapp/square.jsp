<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SQUARE OF NUMBER</title>
</head>
<body bgcolor="yellow">
<form action="square.jsp" method="post">
<h2>Enter A number TO get the Square</h2>
<input type="number" name="num"><br/>
<input type="submit" value="result"><br/>
</form>
<%
try{
	
 int n=Integer.parseInt(request.getParameter("num"));
 int res=n*n;
 out.println("The Square of "+n+" is "+res);
	
}catch(Exception e){
	
}

%>

</body>
</html>