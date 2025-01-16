package sak;
import java.sql.*;
import java.util.Scanner;
public class slip16
{
	public static void main(String arg[])throws Exception
	{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/sak","postgres","sakshi");
		PreparedStatement st=con.prepareStatement("insert into teacher values(?,?,?)");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
		st.setInt(1, 4);
		st.setString(2, "kawale mam");
		st.setString(3, "da");
		st.execute();
		
		}
		st=con.prepareStatement("select * from teacher where sub='java'");
		ResultSet rs=st.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(2));
		}
	}

}
