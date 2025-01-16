//updatedemo
<%@page language="java"%>
<%@page import="java.sql.*"%>
<%
String s1=request.getParameter("t1");
String s2=request.getParameter("t2");
String s3=request.getParameter("t3");
if(s1!=null && s2!=null && s3!=null)
{
  try
  {
     Class.forName("org.postgresql.Driver");
     Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/rbnb","postgres","root");
     Statement st=con.createStatement();
     String q="update emp set ename='"+s2+"',sal="+s3+" where eno="+s1;
     
     int k=st.executeUpdate(q);
     if(k>=1)
     out.println("<h1>Update  success..");
     else
     out.println("<h1>Record not found");
     
    	 st.close();
     con.close();
     }
     catch(Exception e)
     {
        out.println("error="+e);
      }
  }
        %>