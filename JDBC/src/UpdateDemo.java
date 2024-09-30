//Accept emp no,name,sal from user & update name & display of particular emp no.
import java.util.*;
import java.sql.*;
class UpdateDemo 
{
	public static void main(String[] args) 
	{
	  try
	  {
		  Class.forName("org.postgresql.Driver");
		  Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/rbnb","postgres","root");
		  Statement st=con.createStatement();
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter emp no:");
		  int eno=sc.nextInt();
		  System.out.println("enter ename to update:");
		  String nm=sc.next();
		  System.out.println("enter emp sal:");
		  int s=sc.nextInt();
		  int k=st.executeUpdate("update emp set ename='"+nm+"',sal="+s+" where eno="+eno);
		  if(k>=1)
			  System.out.println("Update success..");
		  else
			  System.out.println("Record not found");
		  st.close();
		  con.close();
	  }catch(Exception e)
	  {
		  System.out.println(e);
	  }
	}
}
/*-----output------
Enter emp no:
2
enter ename to update:
Nikita
enter emp sal:
50000
Update success..
*/
