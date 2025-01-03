/*Program to create linkList of integers object do the foll:
 * i)add elements at first position
 * ii)delete last element
 * iii)display the size of linked list
 */
import java.util.*;
public class Demo7 
{
	public static void main(String[] args)
	{
	  LinkedList l1=new LinkedList();
	  l1.add(100);
	  l1.add(200);
	  l1.add(300);
	  l1.add(400);
	  System.out.println("LinkedList="+l1);
	  l1.addFirst(500);
	  System.out.println("After add linked list="+l1);
	  l1.removeLast();
	  System.out.println("After remove Linked list="+l1);
	  System.out.println("size of LinkedList="+l1.size()); 
	}
}
/*--------------output----------------
 * LinkedList=[100, 200, 300, 400]
After add linked list=[500, 100, 200, 300, 400]
After remove Linked list=[500, 100, 200, 300]
size of LinkedList=4
*/
