//Accept values from user update record into the student table using prepared statement...

import java.io.*;
import java.sql.*;
class Update1 
{
	public static void main(String[] args)
	{
	    Connection con;
	    PreparedStatement pst;
	    try
	    {
	    	Class.forName("org.postgresql.Driver");
	    	con=DriverManager.getConnection("jdbc:postgresql://localhost/rbnb","postgres","root");
	    	DataInputStream din=new DataInputStream(System.in);
	    	System.out.println("Enter the roll no:");
	    	int rno=Integer.parseInt(din.readLine());
	    	System.out.println("Enter Name:");
	    	String nm=din.readLine();
	    	System.out.println("Enter per:");
	    	int per=Integer.parseInt(din.readLine());
	    	pst=con.prepareStatement("Update stud set sname=?,per=? where rno=?");
	    	pst.setString(1,nm);
	    	pst.setInt(2, per);
	    	pst.setInt(3,rno);
	    	pst.execute();
	    	System.out.println("Record updated successfully");
	    	con.close();
	    }catch(Exception e)
	    {
	    	System.out.println("Error="+e);
	    }
	}
}
/*
Enter the roll no:
3
Enter Name:
shambhavi
Enter per:
66
Record updated successfully
*/