package sak;
import java.sql.*;
import java.util.Scanner;
public class slip29_1 {

	public static void main(String[] args)throws Exception 
	{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager .getConnection("jdbc:postgresql://localhost/sak","postgres","sakshi");
		Statement st=con.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter table name");
		String s=sc.next();
		ResultSet rs=st.executeQuery("select * from "+s);
		ResultSetMetaData rsm=rs.getMetaData();
       int n=rsm.getColumnCount();
       for(int i=1;i<=n;i++)
    	   System.out.print(rsm.getColumnLabel(i)+"||  ");
        System.out.println();
    	   while(rs.next())
    	   {
    		   for(int i=1;i<=n;i++)
    	 {
    			   
          System.out.print(rs.getString(i)+" || ");
          
       }
    		   System.out.println();
	}
	}
}
