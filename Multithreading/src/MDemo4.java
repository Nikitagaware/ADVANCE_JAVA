import java.util.*;
class K implements Runnable
{
   String s1;
   Thread th;
   K(String s1)
   {
	   this.s1=s1;
	   th=new Thread(this);
	   th.start();
	   
   }
   public void run()
   {
	   try
	   {
		   for(int i=1;i<=s1.length();i++)
		   {
			   if(s1.charAt(i)=='A'||s1.charAt(i)=='a'||s1.charAt(i)=='E'||s1.charAt(i)=='e'||s1.charAt(i)=='I'||s1.charAt(i)=='i'||s1.charAt(i)=='O'||s1.charAt(i)=='o'||s1.charAt(i)=='U'||s1.charAt(i)=='u')
			   {
				   System.out.println(s1.charAt(i));
				   th.sleep(3000);
			   }
		   }
	   }catch(Exception e){}
   }
}
class MDemo4 {

	public static void main(String[] args)
	{
		K ob=new K("shrirampur");

	}

}
