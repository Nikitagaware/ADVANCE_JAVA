package sak;
import java.sql.*;
public class slip30_1 
{
	public static void main(String arg[])throws Exception
	{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager .getConnection("jdbc:postgresql://localhost/sak","postgres","sakshi");
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=st.executeQuery("select * from teacher");
		while(rs.next())
		{
			System.out.print(rs.getString(1)+" ");
			System.out.print(rs.getString(2)+"\n");
		}
	rs.first();
	System.out.println(rs.getString(1)+rs.getString(2));
	rs.last();
	System.out.println(rs.getString(1)+rs.getString(2));
	System.out.println(rs.findColumn("tno"));
	}

}
