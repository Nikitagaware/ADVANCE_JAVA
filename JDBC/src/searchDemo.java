//Accept empno from user & search the record
import java.sql.*;
import java.util.*;
public class searchDemo
{
	public static void main(String[] args)
	{
	   try
	   {
		   Class.forName("org.postgresql.Driver");
		   Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/rbnb","postgres","root");
		   Statement st=con.createStatement();
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter emp number to search:");
		   int no=sc.nextInt();
		   ResultSet rs=st.executeQuery("select*from emp where eno="+no);
		   if(rs.next())
		   {
			   System.out.println("emp no="+rs.getInt(1));
			   System.out.println("emp name="+rs.getString(2));
			   System.out.println("emp sal="+rs.getInt(3));
		   }
		   else
			   System.out.println("Record not found");
		   rs.close();
		   st.close();
		   con.close();
	   }catch(Exception e)
	   {
		   System.out.println(e);
	   }

	}

}
/*---------output------------------
Enter emp number to search:
2
emp no=2
emp name=Nikita
emp sal=50000
*/