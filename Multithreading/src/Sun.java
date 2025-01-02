class O extends Thread
{
	O()
	{
		start();
	}
   public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println("O2 of i="+i);
		synchronized(this)
		{
		for(int i=1;i<=5;i++)
			System.out.println("O1 of i="+i);
		}
		for(int i=1;i<=5;i++)
			System.out.println("O3 of i="+i);
		
	}
}

class Sun
{
	public static void main(String arg[])
	{
		O ob=new O();
	}
}