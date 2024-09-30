//Accept emp no from user & Delete the record.
import java.sql.*;
import java.util.*;
class DeleteDemo 
{
	public static void main(String[] args)throws Exception
	{
	    	Class.forName("org.postgresql.Driver");
	    	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/rbnb","postgres","root");
	        Statement st=con.createStatement();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter emp no:");
	        int eno=sc.nextInt();
	        int k=st.executeUpdate("delete from emp where eno="+eno);
	        if(k>=1)
	        	System.out.println("Record Delete");
	        else
	        	System.out.println("Record not found");
	        st.close();
	        con.close();

	}
}
/*----------output-------------------
Enter emp no:
1
Record Delete
*/
