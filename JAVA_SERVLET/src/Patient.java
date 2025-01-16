/*write a servlet program to display the details of
 * PATIENT(PatientNo,PatientName,PatientAddress,Patientage,PatientDisease)in tabular form on browser..
 */

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class Patient extends HttpServlet
{
   public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
   {
	  res.setContentType("text/html");
	  PrintWriter pw=res.getWriter();
	  try
	  {
		  Class.forName("org.postgresql.Driver");
		  Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/rbnb","postgres","root");
		  Statement st=con.createStatement();
		  ResultSet rs=st.executeQuery("select*from patient");
		  pw.println("<table border<1>");
		  pw.println("<tr><th>Patient no<th>Name<th>Address</tr>");
		  while(rs.next())
		  {
			  pw.println("<tr><td>"+rs.getString(1));
			  pw.println("<td>"+rs.getString(2));
			  pw.println("<td>"+rs.getString(3));
			  pw.println("</tr>");
		  }
		  pw.println("</table");
		  rs.close();
		  st.close();
		  con.close();
		  
	  }catch(Exception e)
	  {
		  pw.println("Error="+e);
	  }
   }
}