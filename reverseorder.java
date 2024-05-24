/*To display 1 to 9999 in reverse order.*/


package thursday_assignments;


public class reverseorder extends Thread
{
	
	public void run() 
	{
		System.out.println("\n\nReverse order is...");
		for(int i=9999;i>=1;i--) 
		{
			System.out.println(i+" ");
		}
	}
}
