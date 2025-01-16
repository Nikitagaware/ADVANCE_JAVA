package sak;
import java.lang.*;
import java.util.Random;
class even
{
	int n;
	even(int n)
	{
		this.n=n;
		System.out.println("square of "+n+"="+n*n);
	}
}
class odd
{
	int n;
	odd(int n)
	{
		this.n=n;
		System.out.println("cube"+n+"="+n*n*n);
	}
	
}
public class slip7 extends Thread
{
	public void run()
	{
		Random rd=new Random();
		int n=rd.nextInt(5);
		if(n%2==0)
		{
			even ob=new even(n);
		}
		else
		{
			odd th1=new odd(n);
		}
				
	}

	public static void main(String arg[])
	{
	
		slip7 th=new slip7();
		th.start();
		
	}
	
}
