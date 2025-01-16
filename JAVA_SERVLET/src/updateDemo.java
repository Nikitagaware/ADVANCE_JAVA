import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class updateDemo extends HttpServlet
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
			int pno=Integer.parseInt(req.getParameter("t1"));
			String nm=req.getParameter("t2");
			String ad=req.getParameter("t3");
			int k=st.executeUpdate("update patient set pname='"+nm+"',addr='"+ad+"' where pno="+pno);
			if(k>=1)
				pw.println("Record updates");
			else
				pw.println("Record not found");
			st.close();
			con.close();
			
		}catch(Exception e)
		{
			pw.println("Error="+e);
		}
	}
}