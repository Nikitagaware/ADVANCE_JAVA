class B extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
			   sleep(1000);
				System.out.println("b of i="+i);
			}
		}catch(Exception e){}
	}
}
class MD1
{
	public static void main(String[] args) 
	{
	   B ob=new B();
	   ob.start();
	}

}
