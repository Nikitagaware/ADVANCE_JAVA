//Design Screen & disp emp info accept emp no & search emp name & sal

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class SearchDemo2 extends Frame implements ActionListener
{
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2;
	SearchDemo2()
	{
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
		l1=new Label("emp no:");
		l2=new Label("emp name:");
		l3=new Label("emp sal:");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		b1=new Button("SAVE");
		b2=new Button("SEARCH");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		try
		{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://localhost/rbnb","postgres","root");
			st=con.createStatement();
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(this,"error="+e);
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			try
			{
				int eno=Integer.parseInt(t1.getText());
				String nm=t2.getText();
				int sal=Integer.parseInt(t3.getText());
			    int k=st.executeUpdate("insert into emp values("+eno+","+nm+","+sal+")");
			     if(k>=1)
			    	 JOptionPane.showMessageDialog(this,"Record inserted");
			}catch(Exception e)
			{
				JOptionPane.showMessageDialog(this,"error="+e);
			}
		}
		if(ae.getSource()==b2)
		{
			try
			{
				int eno=Integer.parseInt(t1.getText());
				rs=st.executeQuery("select * from emp where eno="+eno);
				if(rs.next())
				{
					t2.setText(rs.getString(2));
					t3.setText(rs.getString(3));
				}
				rs.close();
			}catch(Exception e)
			{
				System.out.println("Error="+e);
			}
			}
		}
	public static void main(String erg[])
	{
		new SearchDemo2();
	}
}

