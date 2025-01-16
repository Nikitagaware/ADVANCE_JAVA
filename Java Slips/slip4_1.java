package sak;
import java.util.*;
public class slip4_1
{
	public static void main(String arg[])
	{
	  Hashtable<String,String> ht=new Hashtable<String, String>();
	  ht.put("pune","1234");
	  ht.put("nashik","2345");
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter code and city to put");
	  String cno=sc.next();
	  String name=sc.next();
	  ht.put(name,cno);
	  System.out.println(ht);
	  System.out.println("enter cityname to delete");
	  String s1=sc.next();
	  System.out.println(ht.remove(s1));
	  ht.remove(s1);
	  System.out.println(ht);
	  System.out.println("enter city to search");
	  String s2=sc.next();
	  if(ht.containsKey(s2))
	  {
		  System.out.println("found");
		  System.out.println(ht.get(s2));
		 
	  }
	  
	  
	}

}
