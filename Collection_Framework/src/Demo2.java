//ArrayList..clear(),removeAll()..
import java.util.*;
public class Demo2 
{
	public static void main(String[] args) 
	{
	   ArrayList a1=new ArrayList();
	   a1.add("Java");
	   a1.add("Rbnb");
	   a1.add("College");
	   a1.add("shrirampur");
	   a1.add("Rayat");
	   System.out.println(a1);
	   //a1.clear();
	  if(a1.removeAll(a1))
		   System.out.println("After Remove="+a1);
	  else
		   System.out.println("Collection already empty");
	}
}
/*-------------output-----------------
 * [Java, Rbnb, College, shrirampur, Rayat]
After Remove=[]

 */
