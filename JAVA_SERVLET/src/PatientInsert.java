/*write a servlet program to insert the details of
 * PATIENT(PatientNo,PatientName,PatientAddress,Patientage,PatientDisease)in tabular form on browser..
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class PatientInsert extends HttpServlet
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
			int k=st.executeUpdate("insert into patient values("+pno+",'"+nm+"','"+ad+"')");
			if(k>=1)
				pw.println("Record insert");
			st.close();
			con.close();
			
		}catch(Exception e)
		{
			pw.println("Error="+e);
		}
	}
}