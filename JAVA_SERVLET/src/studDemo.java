import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class studDemo extends HttpServlet
{
	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		int seatno=Integer.parseInt(req.getParameter("t1"));
		String name=req.getParameter("t2");
		String c1=req.getParameter("t3");
		int tot=Integer.parseInt(req.getParameter("t4"));
		float p=(float)tot/6;
		String grade=" ";
		if(p>=80)
			grade="o";
		else if(p>=70)
			grade="A+";
		else if(p>=60)
			grade="A";
		else if(p>=50)
			grade="B";
		else
			grade="fail";
		pw.println("<h1>SeatNo="+seatno);
		pw.println("<h1>Name="+name);
		pw.println("<h1>Class="+c1);
		pw.println("<h1>total Marks="+tot);
		pw.println("<h1>Percentage="+p);
		pw.println("<h1>Grade="+grade);
	}
}
