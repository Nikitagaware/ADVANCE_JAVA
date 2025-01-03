/*Program to accept 'n' numbers  from user,store them into LinkedList
 * collection .display only  odd numbers..
 */
import java.util.*;
public class Demo11 
{
	public static void main(String[] args)
	{
	   LinkedList a1=new LinkedList();
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter limit:");
	   int n=sc.nextInt();
	   System.out.println("Enter n numbers:");
	   for(int i=0;i<n;i++)
	   {
		   int num=sc.nextInt();
		   a1.add(num);
	   }
	   Iterator it=a1.iterator();
	   System.out.println("Odd nos:");
	   while(it.hasNext())
	   {
		   Object ob=it.next();
		   String s=ob.toString();
		   n=Integer.parseInt(s);
		   if(n%2==1)
			   System.out.println(n);
	   }

	}

}
/*-----output---------------
enter limit:
4
Enter n numbers:
1
2
3
4
Odd nos:
1
3
*/