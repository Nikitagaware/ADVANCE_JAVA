import java.util.*;
class X extends Thread
{
  Thread th;
   X()
{
  th=new Thread(this);
  th.start();
  }
public void run()
{
   try
{
   while(true)
  {
      th.sleep(1000);
      Random r1=new Random();
      int n=r1.nextInt(100);
      if(n%2==0)
        new Y(n);
      else
        new Z(n);
   }
  }catch(Exception e){}
}
}
class Y extends Thread
{
 int n;
 Y(int n)
{
  this.n=n;
  start();
}
public void run()
{
   System.out.println("Square of"+n+"="+n*n);
}
}
class Z extends Thread
{
 int n;
 Z(int n)
{
  this.n=n;
  start();
}
public void run()
{
   System.out.println("Cube of"+n+"="+n*n*n);
}
}
public class MDS 
{

	public static void main(String[] args)
	{
		X ob=new X();
	}

}
