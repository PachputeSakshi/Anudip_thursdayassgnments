/*Q5)Write a program in Java to accept a word/a String and display the new string after removing all the vowels present in it.

Sample Input: COMPUTER APPLICATIONS
Sample Output: CMPTR PPLCTNS

*/
package thursday_assignments;

import java.util.Scanner;
public class Ass8q5_25jan 
{
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter string: ");
	        String input = sc.nextLine();
	        
	        String result = removeVowels(input);
	        
	        System.out.println("String after removing vowels: " + result);
	        
	        sc.close(); 
	    }
	    
	    public static String removeVowels(String input)
	    {
	        String result = "";
	        for (int i=0;i<input.length();i++)
	        {
	            char ch = input.charAt(i);
	            if (!isVowel(ch))
	            {
	                result += ch;
	            }
	        }
	        return result;
	    }

	    public static boolean isVowel(char ch)
	    {
	        ch = Character.toUpperCase(ch);
	        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
	    }
	}