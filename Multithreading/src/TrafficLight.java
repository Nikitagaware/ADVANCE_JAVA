/*program that simulate a traffic light
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class TrafficLight extends Applet implements ActionListener,Runnable
{
	Thread th;
	int i;
	public void init()
	{
		i=0;
		th=new Thread(this);
		th.start();
	}
	public void run()
	{
		try
		{
			while(true)
			{
				i++;
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
				i=0;
			}
		}
		public void actionPerformed(ActionEvent ae)
		{
		}
	}
	/*<applet cpde="TrafficLight" width="500" height="500">
	 </applet>
	 */
	 