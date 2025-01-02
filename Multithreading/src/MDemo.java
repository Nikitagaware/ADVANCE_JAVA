 class E extends Thread
 {
	 E()
	 {
		 start();
	 }
	 public void run()
	 {
		 for(int i=1;i<=5;i++)
			 System.out.println("E of i="+i);
	 }
 }
 class F extends Thread
 {
	 F()
	 {
		 start();
	 }
	 public void run()
	 {
		 for(int i=1;i<=5;i++)
			 System.out.println("F of i="+i);
	 }
 }
 class G extends Thread
 {
	 G()
	 {
		 start();
	 }
	 public void run()
	 {
		 for(int i=1;i<=5;i++)
			 System.out.println("G of i="+i);
	 }
 }

 class MDemo
{
	public static void main(String[] args) 
	{
	  	E ob =new E();
	 	F ob1 =new F();
	 	G ob2 =new G();
	}

}
