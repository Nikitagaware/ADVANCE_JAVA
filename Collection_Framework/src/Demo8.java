//hashtable..put(),get()...
import java.util.*;
public class Demo8 
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
	}

}
/*Hashtable={name=Patiksha, rno=101, phno=5743117145, add=shrirampur}
Phone number=null
*/