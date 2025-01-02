class H implements Runnable
{
	Thread th;
	H()
	{
		th=new Thread(this);
		th.start();
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println("h of i="+i);
	}
}
class MDemo1 
{
	public static void main(String[] args)
	{
       H ob=new H();
	}

}
