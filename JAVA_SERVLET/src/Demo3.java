//Addition program ....
import javax.servlet.*;
import java.io.*;
public class Demo3 implements Servlet
{
    ServletConfig sc;
    public void init(ServletConfig sc)
    {
    	this.sc=sc;
    }
    public ServletConfig getServletConfig()
    {
    	return sc;
    }
    public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
    {
    	res.setContentType("text/html");
    	PrintWriter pw=res.getWriter();
    	int a=10;
    	int b=20;
    	int c=a+b;
    	pw.println("<h1>Addition="+c);
    }
    public String getServletInfo()
    {
    	return "this is my first servlet..";
    }
	public void destroy()
	{}
}