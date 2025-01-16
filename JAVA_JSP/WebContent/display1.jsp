<%@page language="java"%>
<%@page import="java.sql.*" %>
<%
String s1=request.getParameter("t1");
if(s1!=null)
{
  try
  {
	  Class.forName("org.postgresql.Driver");
	  Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/rbnb","postgres","root");
	  Statement st=con.createStatement();
	  String q="select* from"+s1;
	  ResultSet rs=st.executeQuery(q);
	  ResultSetMetaData rsm=rs.getMetaData();
	  int cols=rsm.getColumnCount();
	  out.println("<table border=1>");
	  out.println("<tr>");
	  for(int i=1;i<=cols;i++)
	  {
		  out.println("<th>"+rsm.getColumnName(i));
	  }
	  out.println("</tr>");
	  while(rs.next())
	  {
		  out.println("<tr>");
		  for(int i=1;i<=cols;i++)
		  {
			  out.println("<td>"+rs.getString(i));
		  }
		  out.println("</tr>");
	  }
	  out.println("</table>");
	  st.close();
	  con.close();
  }catch(Exception e)
  {
    out.println("Error="+e);
  }
}
%>