<%@page language="java"%>
<%@page import="java.sql.*"%>
<%
 String s1=request.getParameter("t1");
 if(s1!=null)
 {
   try
   {
     Class.forName("org.postresql.Driver");
     Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/rbnb","postgres","root");
     Statement st=con.createStatement();
     String q="select * from emp where ename='"+s1+"'";
     ResultSet rs=st.executeQuery(q);
     if(rs.next())
     {
       out.println("<h1>eno="+rs.getInt(1));
       out.println("<h1>sal="+rs.getInt(3));
      }
      else
      {
    	st.close();
    	con.close();
      }
      }catch(Exception e)
      {
        out.println("Error="+e);
       }
    }
        %>