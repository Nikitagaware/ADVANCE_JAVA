package sak;

public class slip28 
{
	public static void main(String[] args)
	{
		
		Thread th=Thread.currentThread();
		System.out.println(th.getName());
		System.out.println(th.getPriority());
		System.out.println(th.getId());
		if(th.isAlive())
		{
			System.out.println("thread is alive");
		}
			else
				System.out.println("not alive");
		
	}

}
