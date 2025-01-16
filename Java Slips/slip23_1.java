package sak;
import java.util.*;
public class slip23_1 
{
	public static void main(String []arg)
	{
		ArrayList l1= new ArrayList();
		for(int i=0;i<arg.length;i++)
		{
			l1.add(arg[i]);
		}
		Iterator it=l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		ListIterator lit=l1.listIterator();
		lit.next();
		lit.next();
		lit.next();
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
	}

}
