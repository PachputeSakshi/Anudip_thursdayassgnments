/*2.Write a method that takes a String[] as an argument and returns a String containing the concatenation
 *  of all the strings in the input array. Invoke your method 3 times with different arguments. 
 *  Make sure that your code handles the cases where the argument is null.

*/package thursday_assignments;

import java.util.*;
public class Ass9q2_9feb 
{
	
	    public static void main(String[] args)
	    {
	    	Scanner sc=new Scanner(System.in);
	        System.out.print("Enter the number of strings: ");
	        int numstring = sc.nextInt();
	        sc.nextLine(); 

	        //array to store the strings
	        String[] strings = new String[numstring];

	        // enter each string
	        for (int i = 0; i < numstring; i++) 
	        {
	            System.out.print("Enter string " + (i + 1) + ": ");
	            strings[i] = sc.nextLine();
	        }

	        // Display strings
	        System.out.println("Entered strings:");
	        for (String str : strings) 
	        {
	            System.out.println(str);
	        }

	        System.out.println(Ass9q2_9feb.concatenateStrings(strings));
	        
	    }
	    
	    public static String concatenateStrings(String[] array) 
	    {
	    	//handle null input
	        if (array == null)
	        {
	            return ""; 
	        }

	        String result = "";

	        // Concatenate all strings in the array
	        for (String str : array) 
	        {
	            if (str != null) 
	            {
	                result += str;
	            }
	        }

	        return result;
	    }
	}

	

