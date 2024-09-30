//Insert Record into the emp table using prepared Statement..
import java.sql.*;
class Insert1 
{
	public static void main(String[] args) 
	{
	    try
	    {
	    	Class.forName("org.postgresql.Driver");
	    	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/rbnb","postgres","root");
	        PreparedStatement pst=con.prepareStatement("insert into emp values(?,?,?)");
	        pst.setInt(1, 89);
	        pst.setString(2, "om");
	        pst.setInt(3, 998877);
	        int k=pst.executeUpdate();
	        if(k>=1)
	        	System.out.println("Insert Success...");
	        con.close();
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Error="+e);
	    }
	}
}
