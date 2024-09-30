 //Accept rno & Delete the record....using prepared Satement....
import java.sql.*;
import java.io.*;
class Delete1 
{
	public static void main(String[] args) 
	{
		Connection con;
		PreparedStatement pst;
	    try
	    {
	    	Class.forName("org.postgresql.Driver");
	    	con=DriverManager.getConnection("jdbc:postgresql://localhost/rbnb","postgres","root");
	    	pst=con.prepareStatement("delete from stud where rno=?");
	    	DataInputStream din=new DataInputStream(System.in);
	    	System.out.println("Enter roll no:");
	    	int rno=Integer.parseInt(din.readLine());
	    	pst.setInt(1,rno);
	    	pst.execute();
	    	System.out.println("Record Deleted Success");
	    	con.close();
	    }
	    catch(Exception e)
	    {
	    	System.out.println("error="+e);	
	    }
	}
}
/*------output---------------------
Enter roll no:
1
Record Deleted Success
*/