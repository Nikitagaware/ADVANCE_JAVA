package sak;
import java.util.*;
public class slip6 
{
	public static void main(String arg[])
	{
		TreeSet<String>ts=new TreeSet<String>();
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit");
		n=sc.nextInt();
		System.out.println("enter elements ");
		for(int i=0;i<n;i++)
		{
			String n1=sc.next();
			ts.add(n1);	
			}
		System.out.println(ts);
		if(ts.contains("2"))
			System.out.println("yes found");
	}

}
