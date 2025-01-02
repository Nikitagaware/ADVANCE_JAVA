/*Program to calculate the sum & average of an array of 1000 integers(generated
 *randomly)using 10 threads.Each thread calculate the sum of 100 integers
 *use these values to calculates average[use join method]
 */
import java.util.*;
class ThreadDemo implements Runnable
{
    Thread th;
    int i,no,sum;
    int a[]=new int [1000];
    ThreadDemo(String s,int n)
    {
    	Random r1=new Random();
    	th=new Thread(this,s);
    	no=n;
    	int j=0;
    	for(i=1;i<=1000;i++)
    	{
    		a[j]=r1.nextInt(100);
    		j++;
    		
    	}
    	th.start();
    }
    public void run()
    {
    	for(i=0;i<100;i++)
    	{
    		sum=sum+a[no];
    		no++;
    	}
    	System.out.println("sum="+sum);
    	System.out.println("Avg="+sum/100);
    	}
	public static void main(String[] args)throws InterruptedException
	{
	    ThreadDemo t1=new ThreadDemo("Computer",1);
	    t1.th.join();
	    ThreadDemo t2=new ThreadDemo("TYBCS",100);
	    t2.th.join();
	    ThreadDemo t3=new ThreadDemo("BCS",200);
	    t3.th.join();
	    ThreadDemo t4=new ThreadDemo("TY",300);
	    t4.th.join();
	    ThreadDemo t5=new ThreadDemo("sybcs",400);
	    t5.th.join();
	    ThreadDemo t6=new ThreadDemo("fybcs",500);
	    t6.th.join();
	    ThreadDemo t7=new ThreadDemo("hsc",600);
	    t7.th.join();
	    ThreadDemo t8=new ThreadDemo("ssc",700);
	    t8.th.join();
	    ThreadDemo t9=new ThreadDemo("shrirampur",800);
	    t9.th.join();
	    ThreadDemo t10=new ThreadDemo("shirdi",900);
	    t10.th.join();
	    
	}

}
/*-------------output-----------------------
sum=5060
Avg=50
sum=5056
Avg=50
sum=5185
Avg=51
sum=4848
Avg=48
sum=5077
Avg=50
sum=4845
Avg=48
sum=5272
Avg=52
sum=5481
Avg=54
sum=4919
Avg=49
sum=5051
Avg=50
*/