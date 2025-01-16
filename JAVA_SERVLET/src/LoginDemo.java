/*write  a servlet program that accept  username & password validate in the database .If username
 *username & password  is corrext then display college website `or without display error message. 
 */
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class LoginDemo extends HttpServlet 
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
		String u=req.getParameter("t1");
		String p=req.getParameter("t2");
		ResultSet rs=st.executeQuery("Select* from login where username='"+u+"' AND password='"+p+"'");
		if(rs.next())
			res.sendRedirect("http://www.unipune.ac.in");
		else
			pw.println("Invalid user or pass");
		rs.close();
		st.close();
		con.close();
	}catch(Exception e)
	{
		pw.println("error="+e);
		
	}
  }
}
