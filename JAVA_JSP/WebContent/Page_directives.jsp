//Example of Page Directives
//Accept UserName & greet the message
<%@ page language="java" %>
<%@page import ="java.util.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Example of page Directives</title>
</head>
<body>
  <form method="post" action="Page_directives">
  Enter  user name:
  <input type="text" name="t1"><br>
  <input type="submit">
  </form>
</body>
</html>
<%
String s1=request.getParameter("t1");
if(s1!=null)
{
  Date d1=new Date();
  int hr=d1.getHours();
  if(hr>12 && hr<=16)
   out.println("<h1>Good Afternoon:"+s1);
   else if(hr>16 && hr<=20)
   out.println("<h1>good Evening:"+s1);
   else if(hr>20 && hr<=24)
   out.println("<h1>Good night:"+s1);
   else
   out.println("<h1>Good Morning:"+s1);
  }
  %>