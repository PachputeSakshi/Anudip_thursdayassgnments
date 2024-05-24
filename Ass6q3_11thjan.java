
/*Write a program to display all running threads in Java.*/

package thursday_assignments;
 
import java.util.Scanner;

class UserThread extends Thread
{
    private volatile boolean isRunning = true;

    @Override
    public void run() 
    {
        Scanner sc = new Scanner(System.in);

        while (isRunning) 
        {
            System.out.print(Thread.currentThread().getName() + ": Enter something ('exit' to stop): ");
            String userInput = sc.nextLine();

            if ("exit".equalsIgnoreCase(userInput))
            {
                isRunning = false;
                System.out.println(Thread.currentThread().getName() + ": Exiting...");
            } 
            else
            {
                System.out.println(Thread.currentThread().getName() + ": You entered: " + userInput);
            }
        }

        sc.close();
    }
}
public  class Ass6q3_11thjan 
{
	
	    public static void main(String[] args) 
	    {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("enter number Of Threads ");
	        int numberOfThreads=sc.nextInt(); ;

	        for (int i = 1; i <= numberOfThreads; i++) 
	        {
	            UserThread Thread = new UserThread();
	            Thread.setName("Thread " + i);
	            Thread.start();
	        }
	    }
	}



	
	




