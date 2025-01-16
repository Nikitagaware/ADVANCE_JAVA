package sak;

public class slip21_2  extends Thread
{
	String s1;
	int n;
 slip21_2(String s1,int n)
 {
	 this.s1=s1;
	 this.n=n;
	 
 }
 
 synchronized public void run()
 {
	 System.out.println(s1+n);
 }
	public static void main(String[] args) throws InterruptedException
	{
		slip21_2 th,th1;
		for(int i=0;i<3;i++)
		{
			th=new slip21_2("producer",i);
			th.start();
			th.join();
			th1=new slip21_2("consumer",i);
			th1.start();
		
		}
	
	
	}

}
