//Example of List iterator
import java.util.*;
public class Demo14
{
	public static void main(String[] args) 
	{
	    ArrayList a1=new ArrayList();
	    a1.add("Pen");
	    a1.add("Pencil");
	    a1.add("book");
	    a1.add("notebook");
	    ListIterator lit=a1.listIterator();
	    System.out.println("Display forward Direction");
	    while(lit.hasNext())
	    {
	    	 System.out.println(lit.next());
	    }
	    System.out.println("Display Backward Direction ");
	    while(lit.hasPrevious())
	    {
	    	System.out.println(lit.previous());
	    }
	}

}
/*----------------output--------------------
Display forward Direction
Pen
Pencil
book
notebook
Display Backward Direction 
notebook
book
Pencil
Pen
*/