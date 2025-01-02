/*program that simulate a traffic light
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class TrafficWithButton extends Applet implements ActionListener,Runnable
{
	Thread th;
	int i;
	Button b1,b2;
	public void init()
	{
		i=0;
		th=new Thread(this);
		th.start();
		b1=new Button("Start");
		b2=new Button("Stop");
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
				i++;
				if(i==4)
					i=1;
				th.sleep(2000);
				repaint();
			}
		}catch(Exception e)
		{}
		}
		public void paint(Graphics g)
		{
			if(i==1)
			{
				g.setColor(Color.red);
				g.fillOval(100, 100, 100, 100);
			}
			if(i==2)
			{
				g.setColor(Color.yellow);
				g.fillOval(100, 200, 100, 100);
			}
			if(i==3)
			{
				g.setColor(Color.green);
				g.fillOval(100, 300, 100, 100);
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
	}
	/*<applet cpde="TrafficWithButton" width="500" height="500">
	 </applet>
	 */