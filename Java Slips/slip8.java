package sak;

public class slip8 extends Thread
{
	String name;
	int n;
    slip8(String name,int n)
    {
    	this.name=name;
    	this.n=n;
    	
    }
    public void run()
    {
    	for(int i=0;i<n;i++)
    	System.out.println(name);
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	public static void main(String[] args)
	{
		try
		{
	  slip8 th=new slip8("sakshi",10);
	  th.start();
	 
	  slip8 th1=new slip8("kasar", 20);
	  th1.start();
	 
		}catch(Exception e)
		{
			
		}

	}

}
