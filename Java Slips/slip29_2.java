package sak;
import java.util.*;
public class slip29_2
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		int ch;
		Scanner sc=new Scanner(System.in);
	do
	{
		System.out.println("1:add first..");
		System.out.println("2:remove last..");
		System.out.println("3:disp size..");
		System.out.println("enter choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:   System.out.println("enter no add first");
		             l1.addFirst(sc.nextInt());
		             System.out.println(l1);
		             break;
		case 2: int n= l1.getLast();
		            int i=l1.indexOf(n);
		            l1.remove(i);
			        System.out.println(l1);
			        break;
		case 3:   System.out.println(l1.size());     
			         break;
			
		}
		
	}while(ch<4);

	}

}
