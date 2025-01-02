/*Program to display all the vowels from a given string .Each vowels 
 * should display after 3 seconds
 */
 class vowels extends Thread
 {
	 Thread th;
	 String s;
	 vowels(String s)
	 {
		 this.s=s;
		 th=new Thread(this);
		 th.start();
		 
	 }
	 public void run()
	 {
		 try
		 {
			 for(int i=0;i<s.length();i++)
			 {
				 if(s.charAt(i)=='a'||s.charAt(i)=='A'||s.charAt(i)=='e'||s.charAt(i)=='E'
					||s.charAt(i)=='i'||s.charAt(i)=='I'||s.charAt(i)=='o'||s.charAt(i)=='O'
					||s.charAt(i)=='u'||s.charAt(i)=='U')
				 {
	                    th.sleep(3000);
	                    System.out.println(s.charAt(i));
				 }
			 }
		 }catch(Exception e)
		 {
			 System.out.println("Error="+e);
		 }
	 }

	public static void main(String[] args) 
	{
	    vowels ob=new vowels("Shrirampur");
	    
	}

}
/*----------output------------
 i
 a
 u
*/