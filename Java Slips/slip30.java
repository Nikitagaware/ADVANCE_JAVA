package sak;
import java.util.*;
class ar 
{
	int n;
	Scanner sc=new Scanner(System.in);
	void accept(int n)
	{
    synchronized(this)
    {
	this.n=n;
	for(int i=1;i<=10;i++){
	System.out.println(n*i);
	}
    }
	}
	

}
class thread1 extends Thread
{
	
	ar th;
	 thread1(ar th)
	{
	   this.th=th;
	}
	
 public void run()
	{
	 
	 th.accept(5);
	}
 
}

class thread2 extends Thread
{
	
	ar th;
	 thread2(ar th)
	{
	   this.th=th;
	}
	
 public void run()
	{
	
	  th.accept(3);
	}
}
 public class slip30 
{
	public static void main(String arg[])
	{
	ar th=new ar();
	thread1 t1=	new thread1(th);
	thread2 t2=new thread2(th);
	t1.start();
     t2.start();
		
	}
}
