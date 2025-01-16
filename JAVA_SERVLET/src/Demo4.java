import javax.servlet.*;
import java.io.*;
public class Demo4 extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		int a=10;
		int b=20;
		int c=a+b;
		pw.println("<h1>Addition1="+c);
	}
}