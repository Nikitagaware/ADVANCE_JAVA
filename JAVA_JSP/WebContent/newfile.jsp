<%@page langhuage="java" %>
<%@page import="java.sql.*" %>
<%
String s1=request.getParameter("c1");
String s2=request.getParameter("c2");
String s3=request.getParameter("c3");
String s4=request.getParameter("c4");
if(s1!=null)
{
	Cookie ck=new Cookie("java",s1);
	response.addCookie(ck);
    out.println("<br>JAVA added in the cookie...");
}
if(s2!=null)
{
	Cookie ck=new Cookie("php",s2);
	response.addCookie(ck);
    out.println("<br>PHP added in the cookie...");
}

if(s3!=null)
{
	Cookie ck=new Cookie("python",s3);
	response.addCookie(ck);
    out.println("<br>PYTHON added in the cookie...");
}

if(s4!=null)
{
	Cookie ck=new Cookie("jsp",s4);
	response.addCookie(ck);
    out.println("<br>JSP added in the cookie...");
}
Cookie ck1[]=request.getCookies();
for(int i=0;i<ck1.length;i++)
{
	out.println("<br><br>CookieName="+ck1[i].getName());
	out.println("<br>Cookie value="+ck1[i].getValue());
}
%>