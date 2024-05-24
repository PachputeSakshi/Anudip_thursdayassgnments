/*Q.Write a JAVA program which will generate the threads:

- To display 20 terms of Fibonacci series.

- To display 1 to 9999 in reverse order.
*/

package thursday_assignments;

public class Ass5q2_4thjan 
{

	public static void main(String[] args) 
	{
		
		//create threads
		fibonacciseries fibothread=new fibonacciseries();
		fibothread.start();
		
		reverseorder revthread=new reverseorder();
		revthread.start();
	}

}
