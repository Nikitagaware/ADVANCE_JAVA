package sak;
import java.util.*;
public class slip19 
{
	public static void main(String[] args) 
	{
	   LinkedList<String> l1=new LinkedList<String>();
	   l1.add("8");
	   l1.add("7");
	   l1.add("-70");
	   l1.add("-9");
	   Iterator l=l1.iterator();
	   while(l.hasNext())
	   {
		  String s1=(String) l.next();
		  int  n=Integer.parseInt(s1);
		  if(n<0)
			  System.out.println(n);
		   
	   }
	 

	}

}
