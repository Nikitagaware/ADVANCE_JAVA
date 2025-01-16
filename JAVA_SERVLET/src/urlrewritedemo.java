import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class urlrewritedemo extends HttpServlet
{
	public void servlet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String s1=req.getParameter("t1");
		String s2=req.getParameter("t2");
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=a+b;
		pw.println("<h1>Addition="+c);
		
	}
}