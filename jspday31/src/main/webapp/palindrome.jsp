<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Palindrome</title>
</head>
<body>


   <h2>Check if a String is Palindrome or not </h2>
        <form action="" method="post">            
            <label>Enter a Sentence or Word: </label><input type="text" name="string" />
        </form>
        </h4>
       <form style="background:orange;align:center; border-width:5px; border-style:solid; border-style: inset; height:200px; width:500px"></form>
         
        <%
    if("POST".equalsIgnoreCase(request.getMethod()))
    {
        String mystring, revstring;
        Boolean Palindrome;
        mystring = request.getParameter("string");
        mystring = mystring.replace(" ", "");
        mystring = mystring.replaceAll("[^A-Za-z0-9\\-]","");
        mystring = mystring.toLowerCase();
        revstring = new StringBuilder(mystring).reverse().toString();
        Palindrome = new String(mystring).equals(revstring);
        if(Palindrome){
           out.println("<p>Hoorah! It is Palindrome</p>");
        }else{
           out.println("<p>Hoooo! It is not a Palindrome</p>");
        }
        
    }
%>

</body>
</html>
