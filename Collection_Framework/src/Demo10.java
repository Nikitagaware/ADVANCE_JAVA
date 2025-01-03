//Iterator
//Display arraylist element one by one.....
import java.util.*;
public class Demo10
{
	public static void main(String[] args)
	{
	   ArrayList a1=new ArrayList();
	   a1.add("10");
	   a1.add("25");
	   a1.add("47");
	   a1.add("12");
	   Iterator it=a1.iterator();
	   while(it.hasNext())
	   {
		   System.out.println("Value="+it.next());
	   }
	}

}
/*------------output-----------------
Value=10
Value=25
Value=47
Value=12
*/