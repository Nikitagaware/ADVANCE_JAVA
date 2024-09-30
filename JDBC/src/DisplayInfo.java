//Display info of emp table
import java.sql.*;
public class DisplayInfo
{
	public static void main(String[] args) 
	{
	   try
	   {
		   Class.forName("org.postgresql.Driver");
		   Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/rbnb","postgres","root");
		   Statement st=con.createStatement();
		   ResultSet rs=st.executeQuery("select* from emp");
		   while(rs.next())
		   {
			   System.out.println("Emp no="+rs.getInt(1));
			   System.out.println("Emp name="+rs.getString(2));
			   System.out.println("Emp sal="+rs.getInt(3));
		   }
		   rs.close();
		   st.close();
		   con.close();
	   }catch(Exception e)
	   {
		   System.out.println(e);
	   }
	}
}
/*-------output--------------
 * Emp no=1
Emp name=Sakshi
Emp sal=71000
Emp no=2
Emp name=Nikita
Emp sal=50000
*/
