//Accept emp info from user & insert into database.
import java.sql.*;
import java.util.*;
class InsertDemo 
{
	public static void main(String[] args)throws Exception
	{
	    	Class.forName("org.postgresql.Driver");
	    	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/rbnb","postgres","root");
	        Statement st=con.createStatement();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter emp no:");
	        int eno=sc.nextInt();
	        System.out.println("Enter emp name:");
	        String s1=sc.next();
	        System.out.println("Enter emp sal:");
	        int s=sc.nextInt();
	        int k=st.executeUpdate("insert into emp values("+eno+",'"+s1+"',"+s+")");
	        if(k>=1)
	        	System.out.println("Record insert");
	        st.close();
	        con.close();

	}
}
/*--------------output---------------
Enter emp no:
1
Enter emp name:
nikita
Enter emp sal:
45000
Record insert
*/