//Example of All common method of map interface..
import java.util.*;
public class Demo9
{
	public static void main(String[] args)
	{
	   Hashtable ht=new Hashtable();
	   ht.put("rno", "101");
	   ht.put("name", "nikita");
	   ht.put("add", "shrirampur");
	   ht.put("phno", "5743117145");
	   ht.put("name", "Patiksha");
	   System.out.println("Hashtable="+ht);
       System.out.println("Phone number="+ht.get("ph"));
       if(ht.containsKey("name"))
    	   System.out.println("Key is found");
       else
    	   System.out.println("Key is not found");
       if(ht.containsValue("preeti"))
    	   System.out.println("value is found");
       else
    	   System.out.println("value is not found");
       ht.remove("name");
       System.out.println(ht);
       if(ht.isEmpty())
    	   System.out.println("hashTable is empty...");
       else
    	   System.out.println("hashtable is not empty");
       System.out.println("Number of element="+ht.size());
       Hashtable ht1=new Hashtable();
       ht.put("java", "88");
       ht.put("php", "78");
       ht.putAll(ht1);
       System.out.println(ht);
	}
}
/*---------------output---------------
Hashtable={name=Patiksha, rno=101, phno=5743117145, add=shrirampur}
Phone number=null
Key is found
value is not found
{rno=101, phno=5743117145, add=shrirampur}
hashtable is not empty
Number of element=3
{java=88, rno=101, phno=5743117145, add=shrirampur, php=78}
*/