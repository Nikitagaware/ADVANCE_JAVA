//session management.
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class HitCounter extends HttpServlet
{
	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		HttpSession hs=req.getSession(true);
		String val=(String)hs.getAttribute("count");
		if(val==null)
		{
			pw.println("<h1>first Time Visit...");
			hs.setAttribute("count","1" );
		}
		else
		{
			int n=Integer.parseInt(val);
			n++;
			hs.setAttribute("count",""+n);
			pw.println("<h1>Visit count="+n);
		}
	}
}
/*------------------output-----------------------
Visit count=6 
*/