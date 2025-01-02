/*program to define a thread  for printing text on output screen for n no.of
 *times create 3 threads & run them.pass the text 'n' parameters to the thread
 *constructor .
 *Ex:i)first thread print "Hello" 10 times
 *ii)second thread prints "Good Morning" 20 times
 *iii)Third thread prints "Sir/Madam" 30 times 
 */
class PrintText extends Thread
{
	Thread th;
	String s;
	int n;
	PrintText(String s,int n)
	{
		this.s=s;
		this.n=n;
		th=new Thread(this);
		th.start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=n;i++)
			{
				th.sleep(100);
				System.out.println(s);
			}
		}catch(Exception e)
		{
			System.out.println("Error="+e);
		}
	}
	public static void main(String[] args)
	{
	   PrintText ob=new PrintText("Hello",10);
	   PrintText ob1=new PrintText("Good Morning",20);
	   PrintText ob2=new PrintText("SIR",30);
	   
	}

}
/*
-------------------output---------------------
Good Morning
Hello
SIR
Good Morning
Hello
SIR
Good Morning
SIR
Hello
SIR
Hello
Good Morning
SIR
Good Morning
Hello
Good Morning
Hello
SIR
Hello
Good Morning
SIR
SIR
Hello
Good Morning
SIR
Hello
Good Morning
Good Morning
SIR
Hello
SIR
Good Morning
Good Morning
SIR
Good Morning
SIR
SIR
Good Morning
Good Morning
SIR
Good Morning
SIR
SIR
Good Morning
Good Morning
SIR
Good Morning
SIR
Good Morning
SIR
SIR
SIR
SIR
SIR
SIR
SIR
SIR
SIR
SIR
SIR
*/