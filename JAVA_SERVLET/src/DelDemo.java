//delete the record
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import java.sql.*;
public class DelDemo extends HttpServlet 
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
    	    int k=st.executeUpdate("delete from patient where pno="+pno);
    	    if(k>=1)
    	    	pw.println("Record deleted...");
    	    else
    	    	pw.println("Record not found");
    	    st.close();
    	    con.close();
    	}catch(Exception e)
    	{
    		pw.println("error="+e);
    	}
    }

}
