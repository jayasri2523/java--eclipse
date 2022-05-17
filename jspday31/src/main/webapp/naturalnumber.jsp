<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NATURAL NUMBERS</title>
</head>
<body bgcolor="brown">
<form action="naturalnumber.jsp" method="post">
<h2>Enter a limit to print the numbers</h2>
<input type="number" name="num"><br/>
<input type="submit" value="result">

</form>
<%
try{
int n=Integer.parseInt(request.getParameter("num"));
out.println("the natural numbers upto "+n+"<br/>");
for(int i=1;i<=n;i++){
	out.println(i+"<br/>");
}
}catch(Exception e){
	
}
%>

</body>
</html>