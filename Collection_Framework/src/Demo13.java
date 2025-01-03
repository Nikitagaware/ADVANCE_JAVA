/*create the hash table that will maintain the mobile number & student
 *  name display the contact list.
 */
import java.util.*;
public class Demo13
{
	public static void main(String[] args)
	{
       Hashtable ht=new Hashtable();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter limit:");
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
    	   System.out.println("enter name:");
    	   String nm=sc.next();
    	   System.out.println("Enter phone num");
    	   String ph=sc.next();
    	   ht.put(ph,nm);
       
       }
       System.out.println(ht);
	}

}
/*--------------output------------
Enter limit:
2
enter name:
om
Enter phone num
5566778567
enter name:
sai
Enter phone num
1234323456
{1234323456=sai, 5566778567=om}
*/