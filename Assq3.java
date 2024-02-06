/*Have the function PowersofTwo(num) take the num parameter being passed which will be an integer and return the string 
 * true if it's a power of two. If it's not return the string false. For example if the input
 *  is 16 then your program should return the string true but if the input is 22 then the output should be the string false.*/

package Try;

public class Assq3
{
	
	    public static void main(String[] args) 
	    {
	        // Example usage
	        int num1 = 16;
	        int num2 = 22;

	        System.out.println( + num1 + " is a power of two Ans-> " + PowersofTwo(num1));
	        System.out.println( + num2 + " is a power of two Ans-> " + PowersofTwo(num2));
	    }

	    public static boolean PowersofTwo(int num)
	    {
	        if (num == 0)
	            return false;

	        while (num != 1) 
	        {
	            
	            if (num % 2 != 0)
	                return false;
	            num /= 2;
	        }
	        return true;
	    }
	    

}
	

	

