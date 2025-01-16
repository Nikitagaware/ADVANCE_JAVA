import javax.servlet.*;
import java.io.*;
public class PrimeDemo extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		int num=Integer.parseInt(req.getParameter("t1"));
		int i;
		for(int n=1;n<=num;n++)
		{
			for(i=2;i<n;i++)
			{
				if(n%i==0)
					break;
			}
			if(i==n)
				pw.println("<br>Font color='red'>Prime no="+n);
		}
	}
}