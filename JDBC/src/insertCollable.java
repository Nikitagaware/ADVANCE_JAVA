//insert Record int the emptable using callableStatement...
import java.sql.*;                                                                   

public class insertCollable 
{
	public static void main(String[] args) 
	{
	     try
	     {
	    	 Class.forName("org.postgresql.Driver");
	    	 Connection con=DriverManager.getConnection("jdbc:postresql://localhost/rbnb","postgres","root");
	    	CallableStatement cst=con.prepareCall("{call insertRecord(?,?,?)}");
	    	cst.setInt(1,9);
	    	cst.setString(2, "saiesh");
	    	cst.setInt(3, 88);
	    	cst.execute();
	    	System.out.println("Record insert");
	    	
	     }catch(Exception e)
	     {
	    	 System.out.println("Error="+e);
	     }
	}

}
