package sak;
import java.util.*;
public class slip21
{
	public static void main(String arg[])
	{
		int n;
		LinkedList<String> l1=new LinkedList<String>();
		System.out.println("enter limit");
		Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 System.out.println("enter sub names");
		 String s1;
		 for(int i=0;i<n;i++)
		 {
			 s1=sc.next();
			 l1.add(s1);
		 }
		 Iterator l=l1.iterator();
		 while(l.hasNext())
		 {
			 System.out.println(l.next());
		 }
	}

}
