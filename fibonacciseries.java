/* To display 20 terms of Fibonacci series.*/

package thursday_assignments;


public class fibonacciseries extends Thread
{
	public void run() 
	{
		int n=20;
		int nextterm,firstterm=0,secondterm=1;
		System.out.println("\nFibonacci series...");
		
		for(int i=0;i<n;i++) 
		{
			System.out.println(firstterm+" ");
			nextterm=firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
		}	
	}
	
}
