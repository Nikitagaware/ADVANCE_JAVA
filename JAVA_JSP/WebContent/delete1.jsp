<%@page language="java"%>
<%@page import="java.sql.*" %>
<%
String  s1=request.getParameter("t1");
if(s1!=null)
{
  try
  {
     Class.forName("org.postgresql.Driver");
     Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/rbnb","postgres","root");
     Statement st=con.createStatement();
     String q="delete from emp where ename='"+s1+"'";
     int k=st.executeUpdate(q);
     if(k>=1)
     out.println("<h1>Delete Succ..");
     else
      out.println("<h1>Record not found");
      st.close();
      con.close();
    }catch(Exception e)
    {
      out.println("Error="+e);
     }
   }
   %>