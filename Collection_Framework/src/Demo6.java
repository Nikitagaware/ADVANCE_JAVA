//TreeSet
/*Program to create a new tree set,add some colors(String) & print out 
 * the tree set
 */
import java.util.*;
public class Demo6 
{
public static void main(String[] args) 
{
   TreeSet a1=new TreeSet();
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the limit:");
   int n=sc.nextInt();
   for(int i=0;i<n;i++)
   {
	   System.out.println("enter Color name:");
	   String s1=sc.next();
	   a1.add(s1);
   }
   System.out.println("All colors="+a1);
	}

}
/*-------------output---------------
Enter the limit:
3
enter Color name:
pink
enter Color name:
yellow
enter Color name:
red
All colors=[pink, red, yellow]
*/