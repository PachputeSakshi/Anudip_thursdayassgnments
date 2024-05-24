/*Write a program to demonstrate the chained exception in Java.
*/

package thursday_assignments;

public class Ass5q3_4thjan 
{

	public static void main(String[] args) 
	{
		
		        try 
		        {
		            // arithmetic operation causing an exception
		            int result = divide(10, 0);
		        }
		        catch (ArithmeticException e) 
		        {
		            // Creating a new exception and chaining it with the original one
		            RuntimeException chainedException = new RuntimeException("Error in division", e);

		            // Printing the chained exception
		            chainedException.printStackTrace();
		        }
	
	}
		    private static int divide(int numerator, int denominator)
		    {
		        try 
		        {
		            // Attempting the division
		            return numerator / denominator;
		        } 
		        catch (ArithmeticException e) 
		        {
		            // Throwing a new exception with additional information
		            throw new ArithmeticException("Division by zero occurred");
		        }
		    }

}


