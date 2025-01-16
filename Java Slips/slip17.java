package sak;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class slip17 extends JFrame implements Runnable,ActionListener
{
	JButton b1,b2;
	JTextField t1;
	Thread th;
	int i=0;
	slip17()
	{
		setVisible(true);
		setLayout(new FlowLayout());
		setSize(500,500);
		b1=new JButton("start");
		b2=new JButton("stop");
		b1.addActionListener(this);
        b2.addActionListener(this);
        t1=new JTextField(10);
        th=new Thread(this);
        th.start();
        add(t1);;
        add(b1);
        add(b2);
		
	}
	
	public void run() 
	{	try
	{
		 while(true)
		   {
			   for(i=0;i<100;i++)
			   {
			     th.sleep(1000);
				   t1.setText(""+i);
			   }
			   
		   }
	}catch(Exception e)
	{
		
	}
	}

	public void actionPerformed(ActionEvent ae) 
	{	
		
		if(ae.getSource()==b1)
		{
			th.resume();
		}
		if(ae.getSource()==b2)
		{
			th.suspend();
		}
	}

	

	public static void main(String arg[])
	{
		new slip17();
	}
	
	
}
