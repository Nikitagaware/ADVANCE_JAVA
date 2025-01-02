//program for drawing star on the applet container
import java.util.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class DrawStar extends Applet implements ActionListener,Runnable
{
    Thread th;
    Button b1,b2;
    public void init()
    {
    	th=new Thread(this);
    	th.start();
    	b1=new Button("start");
    	b2=new Button("stop");
    	add(b1);
    	add(b2);
    	b1.addActionListener(this);
       	b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
    	if(ae.getSource()==b1)
    	{
    		th.resume();
    	}
    	if(ae.getSource()==b2)
    	{
    	  try
    	  {
    		  th.suspend();
    	  }catch(Exception e)
    	  {}
    	}
    }
    public void run()
    {
    	try
    	{
    		while(true)
    		{
    			th.sleep(1000);
    			repaint();
    		}
    	}catch(Exception e){}
    	  }
    public void update(Graphics g)
    {
    	Random r1=new Random();
    	int x=r1.nextInt(500);
    	int y=r1.nextInt(500);
    	g.setColor(new Color(r1.nextInt(255),r1.nextInt(255),r1.nextInt(255)));
    	g.fillOval(x, y, 50, 50);
    	g.setColor(new Color(r1.nextInt(255),r1.nextInt(255),r1.nextInt(255)));
    	g.fillOval(x+10, y+10, 30, 30);
    	}
    }
/*<applet code="DrawStar" width="500" height="500"></applet>*/