//ArrayList..remove(),add(),remove(index),addAll()......
import java.util.*;
public class Demo1 
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
	   //a1.remove("College");
	   a1.remove(2);
	   System.out.println(a1);
	   ArrayList a2=new ArrayList();
	   a2.add("C Lang");
	   a2.add("DBMS");
	   a1.addAll(2,a2);
	   System.out.println(a1);
	}
}
/*-----------output------------
[Java, Rbnb, College, shrirampur, Rayat]
[Java, Rbnb, shrirampur, Rayat]
[Java, Rbnb, C Lang, DBMS, shrirampur, Rayat]
*/