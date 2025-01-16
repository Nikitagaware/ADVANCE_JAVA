package sak;
import java.awt.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.*;
public class slip12 extends JFrame 
{
	JTable t1;
	Vector c1,r1;
	Vector row;
	slip12()
	{
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
		row=new Vector();
		c1=new Vector();	
		try
		{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/sak","postgres","sakshi");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from project");
		ResultSetMetaData rmd=rs.getMetaData();
		int n=rmd.getColumnCount();
		for(int i=1;i<=n;i++)
		{
			c1.add(rmd.getColumnLabel(i));
		}

		while(rs.next())
		{
			r1=new Vector();
		for(int i=1;i<=n;i++)
		{
			String s1=rs.getString(i);
			r1.add(s1);
		
		}	
		row.add(r1);
		}
	
		t1=new JTable(row,c1);
		JScrollPane jsp=new JScrollPane(t1);
		add(jsp);
		}catch(Exception e)
		{
		}
	}
public static void main(String arg[])
{
	new slip12();
}
}
