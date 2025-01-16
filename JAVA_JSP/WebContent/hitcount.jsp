//Hitcount no of times web page  visited using Jsp
<%@page language="java" %>
<%@page session="true"%>
<%
  String s1=(String)session.getAttribute("count");
  if(s1==null)
  {
    out.println("<h1>First Time Visit..");
    session.setAttribute("count","1");
    }
    else
    {
       int n=Integer.parseInt(s1);
       n++;
       out.println("visitcount="+n);
       session.setAttribute("count",""+n);
       }
       %>