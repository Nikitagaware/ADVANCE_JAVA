package sak;
import java.sql.*;
public class slip29 {

	public static void main(String[] args)throws Exception 
	{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager .getConnection("jdbc:postgresql://localhost/sak","postgres","sakshi");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from teacher");
		ResultSetMetaData rsm=rs.getMetaData();
       int n=rsm.getColumnCount();
       System.out.println("columns="+n);
     
      System.out.println(rsm.getColumnDisplaySize(2));
      if(rsm.isWritable(1))
    	  System.out.println("we write in columns");
			System.out.println(rsm.isNullable(2));
		
		
	}

}
