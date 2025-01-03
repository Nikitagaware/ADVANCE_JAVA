//Example of Enumeration
import java.util.*;
public class Demo15
{
	public static void main(String[] args) 
	{
	   Hashtable ht=new Hashtable();
	   ht.put("om", "44");
	   ht.put("sai", "74");
	   ht.put("Ram", "94");
	   ht.put("sham", "54");
	   Enumeration e1=ht.elements();
	   System.out.println("All values");
	   while(e1.hasMoreElements())
	   {
		   System.out.println(e1.nextElement());
	   }
	   Enumeration e2=ht.keys();
	   System.out.println("All keys:");
	   while(e2.hasMoreElements())
	   {
		   System.out.println(e2.nextElement());
	   }
	}
}
/*---------------output--------------------
All values
74
44
54
94
All keys:
sai
om
sham
Ram
*/