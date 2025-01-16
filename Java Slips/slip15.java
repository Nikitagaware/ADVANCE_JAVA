package sak;

public class slip15 extends Thread
{
	
	public void run()
	{
		System.out.println("hiii");
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String arg[])
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		slip15 th=new slip15();
		th.start();
	}

}
