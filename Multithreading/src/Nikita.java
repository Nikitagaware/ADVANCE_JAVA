class L extends Thread
{
	L()
	{
		start();
	}
	synchronized public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println("L of i="+i);
	}
}
class M extends Thread
{
	M()
	{
		start();
	}
	synchronized public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println("M of i="+i);
	}
}
class N extends Thread
{
	N()
	{
		start();
	}
   synchronized	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println("N of i="+i);
	}
}
class Nikita
{
	public static void main(String arg[])
	{
		L ob=new L();
		M ob1=new M();
		N ob2=new N();
	}
}