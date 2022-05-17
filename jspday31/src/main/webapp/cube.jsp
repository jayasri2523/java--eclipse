<html>
<head>
<meta charset="ISO-8859-1">
<title>CUBE OF A NUMBER</title>
</head>
<body bgcolor="red">
<h2 align="center" ></h2>
<form action="cube.jsp" method="post">
<h2>Enter a number to get the cube</h2>
<input type="number" name="num">
<input type="submit" value="result">

</form>

<hr/>
<%
try{
long n = Long.parseLong(request.getParameter("num"));
long res=0;

	 res = (n*n*n);

out.println("The Cube of "+n+" is "+res);
}catch(Exception e){
	
}

%>
<hr/>

</body>
</html>