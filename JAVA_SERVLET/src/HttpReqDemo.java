/*write a servlet program that provides info about a HTTP request from a client
  such as  IP address & browser type.The servlet also provides info about the server on which
   the servlet is running such as the operating  system type, & the 
   names of currently loaded servlet 
 */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HttpReqDemo extends HttpServlet
{
	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("Request method Name="+req.getMethod());
		pw.println("<br>Path Info:"+req.getPathInfo());
		pw.println("<br>Protocol Name:"+req.getProtocol());
		pw.println("<br>Remote Address:"+req.getRemoteAddr());
		pw.println("<br>remote host:"+req.getRemoteHost());
		pw.println("<br>Remote User:"+req.getRemoteUser());
		pw.println("<br>Request URL:"+req.getRequestURL());
		pw.println("<br>Server Name:"+req.getServerName());
		pw.println("<br>ContentType:"+req.getContentType());
		
	}
}
/*-----------------output-----------------------
Request method Name=GET 
Path Info:null 
Protocol Name:HTTP/1.1 
Remote Address:0:0:0:0:0:0:0:1 
remote host:DESKTOP-I41OG67 
Remote User:null 
Request URL:http://localhost:8080/JAVA_SERVLET/HttpReqDemo 
Server Name:localhost 
ContentType:null 
*/