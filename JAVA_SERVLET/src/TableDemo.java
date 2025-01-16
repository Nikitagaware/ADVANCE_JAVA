/*write a servlet to accept table name from user & display 
 * table in tabular format...
 */
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
import java.util.*;
public class TableDemo extends HttpServlet
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
			String ln=req.getParameter("t1");
			ResultSet rs=st.executeQuery("select*from"+ln);
			ResultSetMetaData rsm=rs.getMetaData();
			int cols=rsm.getColumnCount();
			pw.println("<table border=1>");
			pw.println("<tr>");
			for(int i=1; i<=cols;i++)
			{
				pw.println("<th>"+rsm.getColumnName(i));
			}
			pw.println("</tr>");
			while(rs.next())
			{
				pw.println("<tr>");
			   for(int i=1;i<=cols;i++)
			   {
			    	pw.println("<td>"+rs.getString(i));
			   }
			pw.println("</tr>");
		}
		pw.println("</table>");
	    rs.close();
	    st.close();
	    con.close();
      }catch(Exception e)
       {
	     pw.println("Error="+e);
        }
   }
}