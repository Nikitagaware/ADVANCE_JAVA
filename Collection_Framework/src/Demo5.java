//LinkedList..
/*Program to read 'n' names of your friends,store it into linked list,also 
 *display contents of the same.. 
 */
import java.util.*;
public class Demo5
{
	public static void main(String[] args) 
	{
	   LinkedList a1=new LinkedList();
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Limit:");
	   int n=sc.nextInt();
	   for(int i=0;i<n;i++)
	   {
		   System.out.println("Enter friend Name:");
		   String s1=sc.next();
		   a1.add(s1);
	   }
	   System.out.println("all friends="+a1);
	}
}
/*----------output----------
Enter Limit:
3
Enter friend Name:
Divya
Enter friend Name:
Sonali
Enter friend Name:
Rohini
all friends=[Divya, Sonali, Rohini]
*/