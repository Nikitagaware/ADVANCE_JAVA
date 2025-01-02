class A extends Thread
{
	A()
	{
		start();
		
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				
			    sleep(1000);
				System.out.println("A of i="+i);
			}
		}catch(Exception e){}
	}
}
class MD
{
	public static void main(String[] args) 
	{
	   A ob=new A();
	}

}
