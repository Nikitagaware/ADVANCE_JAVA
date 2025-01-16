package sak;
import java.util.*;
public class slip23 implements Runnable
{
	Thread th=new Thread(this);
	slip23()
	{
		th.start();
	}
	public void run()
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s1=sc.next();
		for(int i=0;i<s1.length();i++)
		{
		if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')
		{
			System.out.println(s1.charAt(i));
			th.sleep(3000);
		}
		}
		}catch(Exception e){}
	}
	public static void main(String arg[]) throws InterruptedException
	{
		new slip23();
		
	}
	

}
