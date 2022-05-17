<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PrimeNumber</title>
</head>
<body bgcolor="gray">
<h2 align='center'>
<form method="post" action="primenumber.jsp">
Enter a limit:<input type="number" name="num" placeholder="123456789"><br/>
<input type="submit" value="PrimeNum's">

</form>
</h2>

<%
try{
int number = Integer.parseInt(request.getParameter("num"));

out.println(" The list of prime numbers upto "+number+" : <br/>");
for(int i=2;i<number;i++) {
	boolean isprime=true;
	for(int j=2;j<=i/2;j++) {
		if(i%j==0) {
			isprime = false;
			break;
		}
	}
	if(isprime==true)
		out.println(i+"<br/>");
}
}catch(Exception e){
	
}

%>
</body>
</html>