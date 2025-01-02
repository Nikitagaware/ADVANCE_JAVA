class C extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
			   sleep(1000);
				System.out.println("c of i="+i);
			}
		}catch(Exception e){}
	}
}
class MD2
{
	public static void main(String[] args) 
	{
	   C ob=new C();
	   Thread th=new Thread(ob);
	   th.start();
	}

}

