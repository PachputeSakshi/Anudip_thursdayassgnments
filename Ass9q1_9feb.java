/*1.Write a method that takes a String and returns a String of the same length containing the 'X' character
 *  in all positions except the last 4 positions. The characters in the last 4 positions must be the same as 
 *  in the original string. For example, if the argument is
"12345678", the return value should be "XXXX5678".
*/

package thursday_assignments;

import java.util.*;
public class Ass9q1_9feb 
{
	
	public static void main(String[] args) 
	{
		//accept5 input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=sc.nextLine();
		
		String modifiedstr=modifystring(str);
		System.out.println(modifiedstr);
	}
	

	private static String modifystring(String input)
	{
		//handle null condition
		 if (input == null || input.length() < 4) 
		 {
	            return input; 
	       }

	        String modifiedString = "";

	        
	        for (int i=0;i<input.length()-4;i++) 
	        {
	            modifiedString += 'X';
	        }

	        
	        modifiedString += input.substring(input.length() - 4);

	        return modifiedString;
		
	}
	   
}
