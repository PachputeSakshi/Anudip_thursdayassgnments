/*. Write a program that creates 2 threads - each displaying a message (Pass the message as a parameter to the constructor).
 *  The threads should display the messages continuously till the user presses ctrl+c.
*/

package thursday_assignments;


public class Ass5q1_4thjan 
{
	public static void main(String[] args) 
	{
		try 
		{
			//creating threads 
			displaymessage thread1=new displaymessage("Hello");
			displaymessage thread2=new displaymessage("How are u");
			
			//starting threads
			thread1.start();
			thread2.start();
			
			System.out.println("please enter ctrl+c...");
			while(true) 
			{
				Thread.sleep(100);
			}	
		}
		catch(InterruptedException e) 
		{
		//exits
		}
		
	}

}
