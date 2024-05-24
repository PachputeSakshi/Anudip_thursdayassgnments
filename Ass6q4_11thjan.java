/*Q. Write a program to set the priorities of the thread.*/

package thursday_assignments;


public class Ass6q4_11thjan 
{
	public static void main(String[] args) 
	{
        Threads thread1 = new Threads("Thread 1");
        Threads thread2 = new Threads("Thread 2");
        Threads thread3 = new Threads("Thread 3");

        // Setting priorities
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);

        // Starting threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
