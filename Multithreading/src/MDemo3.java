import java.util.*;
class J implements Runnable
{
	Thread th;
	J()
	{
		th=new Thread(this);
		th.start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=100;i++)
			{
				Random r1=new Random();
				int n=r1.nextInt(100);
				System.out.print(" "+n);
			}
		}catch(Exception e){}
	}
}
class MDemo3 
{
	public static void main(String[] args)
	{
	    J ob=new J();
	}

}
