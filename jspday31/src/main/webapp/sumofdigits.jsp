<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SUM OF DIGITS</title>
</head>
<body bgcolor="violet">
<form name="sumofdigits" action="sumofdigits.jsp" method="post">

Enter a number:<input type="number" name="num" placeholder="9999999999"><br/>
Click Here to get the sum of digits:<input type="submit" value="result"><br/>
<input type="reset" value="clean"><br/>
</form>

<hr/>
<%
try{
int a = Integer.parseInt(request.getParameter("num"));
int sum =0;
int r;
while(a>0) {
	r=a%10;
	sum=sum+r;
	a=a/10;
	
}
out.println("result ="+sum);

}catch(Exception e){
	
}
%>
<hr/>

</body>
</html>