//Example of cookie..............<br>
<%@page language="java"%>
<%@page import="java.sql.*"%>
<%@page import="javax.servlet.*"%>
<html>
<body>
  <form method="post" action="cookie.jsp">
   Enter cookie name:
   <input type="text" name="t1"><br>
   Enter cookie value:
   <input type="text" name="t2"><br>
   <input type="submit" value="Add Cookie">
  </form>
</body>
</html>
<%
String s1=request.getParameter("t1");
String s2=request.getParameter("t2");
if(s1!=null && s2!=null)
{
	Cookie c1=new Cookie(s1,s2);
	response.addCookie(c1);
	out.println("<br>cookie added Success");
	Cookie ck1[]=request.getCookies();
	for(int i=0;i<ck1.length;i++)
	{
		out.println("<br><br>CookieName="+ck1[i].getName());
		out.println("<br>cookie Value="+ck1[i].getValue());
	}
}