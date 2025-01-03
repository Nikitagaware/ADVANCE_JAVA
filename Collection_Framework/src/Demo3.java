//ArrayList..add(),sublist(),stack(),addAll(),containsAll()...
import java.util.*;
public class Demo3
{
	public static void main(String[] args) 
	{
	   ArrayList a1=new ArrayList();
	   a1.add("Java");
	   a1.add("Rbnb");
	   a1.add("College");
	   a1.add("shrirampur");
	   a1.add("Rayat");
	   //System.out.println(a1.subList(1,4));
	   System.out.println(a1);
	   Stack a2=new Stack();
	   a2.add("Php");
	   a2.add("Python");
	   a2.add("Project");
	   a1.addAll(a2);
	   System.out.println(a1);	
	  if(a1.containsAll(a2))
		   System.out.println("Elements found");
	  else
		   System.out.println("elements Not found");
	}
}
/*----------------output--------
[Java, Rbnb, College, shrirampur, Rayat]
[Java, Rbnb, College, shrirampur, Rayat, Php, Python, Project]
Elements found
*/