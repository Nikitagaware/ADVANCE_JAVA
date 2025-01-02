/*program in which thread sleep  for 6 sec in the loop in reverse order
 * from 100 to 1 and change the name of thread
 * 
 */
public class Reverseorder 
{
	public static void main(String[] args) 
	{
	  try
	  {
		  Thread th=Thread.currentThread();
		  th.setName("ReverseThread");
		  System.out.println(th);
		  for(int i=100;i>=1;i--)
		  {
			  System.out.println(i);
			  Thread.sleep(6000);
		  }
			  
	  }catch(Exception e)
	  {
		  System.out.println(e);
	  }
	}
}
/*----------output-----------------
Thread[ReverseThread,5,main]
100
99
98
.....1
*/