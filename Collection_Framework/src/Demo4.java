/*Program to accept names of 'n' cities,insert same into array list collection
 *& display the contends of same arrayList,also remove all these elements 
 */
import java.util.*;
public class Demo4 
{
	public static void main(String[] args) 
	{
	  ArrayList a1=new ArrayList();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the limit:");
	  int n=sc.nextInt();
	  for(int i=0;i<n;i++)
	  {
		  System.out.println("Enter city name:");
		  String s1=sc.next();
		  a1.add(s1);
	  }
	  System.out.println("All cities="+a1);
	  a1.clear();
	  System.out.println("After remove="+a1);
	}
}
/*--------------output----------
 * Enter the limit:
3
Enter city name:
pune
Enter city name:
nashik
Enter city name:
shirdi
All cities=[pune, nashik, shirdi]
After remove=[]
*/