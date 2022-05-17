<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form method="post" action="calci.jsp">
Enter operator:<input type="text" name="operator"></br>
Enter Input A:<input type="text" name="input1" ></br>
Enter Input B:<input type="text" name="input2"></br>
<input type ="submit" value ="compute">
<input type ="submit" value ="clear">
</form>
<hr/>
<%
   if(request.getParameter("input1")!=null){
    String operator=request.getParameter("operator");
 int a=Integer.parseInt(request.getParameter("input1"));
 int b=Integer.parseInt(request.getParameter("input2"));
 switch(operator) {
 case "+" :
  int c=a+b;
  out.println("The sum of "+a+ "and"+ b+ "is :"+c);
  break;
 case "-" :
  
  out.println("The difference of "+a+ "and"+ b+ "is :"+(a-b));
          break;
 case "*" :
  
  out.println("The product of "+a+ "and"+ b+ "is :"+a*b);
 break;
 case "/" :
  
  out.println("The division of "+a+ "and"+ b+ "is :"+a/b);
    break;
 case "%" :
  
  out.println("The remainder of is :"+a%b);
 break;
 }
   }
%>
<hr/>
</body>
</html>
