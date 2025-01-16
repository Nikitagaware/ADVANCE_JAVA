//Example of Httpservlet
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Demo5 extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		int a=10;
		int b=20;
		int c=a+b;
		pw.println("<h1>Addition3="+c);
		
	}
}