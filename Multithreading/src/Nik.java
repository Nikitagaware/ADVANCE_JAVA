class P extends Thread
{
   public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println("P of i="+i);
	}
}
class Q extends Thread
{
    public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println("Q of i="+i);
	}
}
class R extends Thread
{
   public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println("R of i="+i);
	}
}
class Nik
{
	public static void main(String arg[])
	{
		P ob=new P();
		Q ob1=new Q();
		R ob2=new R();
		Thread th1=new Thread(ob);
		Thread th2=new Thread(ob1);
		Thread th3=new Thread(ob2);
		System.out.println("first thread Priority="+th1.getPriority());
		System.out.println("Second thread Priority="+th2.getPriority());
		System.out.println("Third thread Priority="+th3.getPriority());
	   th1.setPriority(Thread.MIN_PRIORITY);
	   th2.setPriority(Thread.MAX_PRIORITY);
	   th3.setPriority(Thread.NORM_PRIORITY);
	   th1.start();
	   th2.start();
	   th3.start();
	}
}