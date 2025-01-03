/*Program to accept 'n' names from user store them into arrayList,sort
 * them in ascending order & display it..
 * 
 */
import java.util.*;
public class Demo12 
{
	public static void main(String[] args)
	{
	   ArrayList  a1=new ArrayList();
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter limit:");
	   int n=sc.nextInt();
	   System.out.println("Enter n names");
	   for(int i=0;i<n;i++)
	   {
		   String nm=sc.next();
		   a1.add(nm);
	   }
	   Collections.sort(a1);
	   Collections.reverse(a1);
	   System.out.println(a1);
	}
}
/*------------output-----------------
enter limit:
4
Enter n names
nikita
mayuri
meera
meena
[nikita, meera, meena, mayuri]
*/