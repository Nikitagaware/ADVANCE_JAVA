class I implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println("I of i="+i);
	}
}
class MDemo2
{
	public static void main(String[] args)
	{
       I ob=new I();
       Thread th=new Thread(ob);
       th.start();
	}

}
