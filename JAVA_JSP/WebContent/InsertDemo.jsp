//InsertDemo..
<%@page language="java"%>
<%@page import="java.sql.*"%>
<html>
<body>
<form method="post" action="">
 enter Emp no:
 <input type="text" name="t1"><br>
 Enter Emp name:
 <input type="text" name="t2"><br>
 Enter emp sal:
 <input type="text" name="t3"><br>
 <input type="submit" value="insert">
</form>
</body>
</html>
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
     String q="insert into emp values("+s1+",'"+s2+"',"+s3+")";
     int k=st.executeUpdate(q);
     if(k>=1)
     out.println("<h1>Insert success..");
     st.close();
     con.close();
     }
     catch(Exception e)
     {
        out.println("error="+e);
      }
  }
        %>