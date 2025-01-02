//program to Bouncing ball
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class BouncingBall extends Applet implements ActionListener,Runnable
{
    Thread th;
    Button b1,b2;
    int x;
    static int i;
    public void init()
    {
    	x=0;
    	th=new Thread(this);
    	th.start();
    	b1=new Button("start");
    	b2=new Button("stop");
    	add(b1);
    	add(b2);
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    }
    public void run()
    {
    	try
    	{
    		while(true)
    		{
    			x=x+10;
    			if(x==500)
    				x=0;
    			th.sleep(1000);
    			repaint();
    		}
    	}catch(Exception e){}
    }
    public void paint(Graphics g)
    {
    	i++;
    	if(i%2==0)
    		g.drawOval(x, 100, 50, 50);
    	else
    		g.drawOval(x,0,50,50);
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
    }
/*<applet code="BouncingBall" width="500" height="500"></applet>
*/