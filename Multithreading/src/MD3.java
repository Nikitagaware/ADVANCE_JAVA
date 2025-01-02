class D extends Thread
{
	Thread th;
	D()
	{
		th=new Thread(this);
		th.start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
			   sleep(1000);
				System.out.println("D of i="+i);
			}
		}catch(Exception e){}
	}
}
class MD3
{
	public static void main(String[] args) 
	{
	   D ob=new D();
	}

}
