/*Q4)WAP to enter any sentence and calculate the following:

  a) Total number of digits present in it.
  b) Total number of small letters and capital letters present in it.
  c) Total number of alphabets used in it.
  d) Total number of special character used in it.
  e) Total number of vowels presents in it.
  f) Total Number words present in that sentence.*/

package thursday_assignments;

import java.util.*;
public class Ass8q4_25jan 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sentence:");
		String sentence=sc.nextLine();
		
		int digitcount=0;
		int lowercount=0;
		int uppercount=0;
		int alphabetcount=0;
		int specialcharcount=0;
		int vowelcount=0;
		int wordscount=0;
		
		for (int i = 0; i < sentence.length(); i++) 
		{
            char ch = sentence.charAt(i);
		 if (Character.isDigit(ch))
		 {
             digitcount++;
         } 
		 else if (Character.isUpperCase(ch))
		 {
             uppercount++;
             alphabetcount++;
         } 
		 else if (Character.isLowerCase(ch)) 
		 {
             lowercount++;
             alphabetcount++;
         } 
		 else if (Character.isWhitespace(ch)) 
		 {
             wordscount++;
         } 
		 else 
		 {
             specialcharcount++;
         }
         
         if (isVowel(ch))
         {
             vowelcount++;
         }
     }
     
     // Counting the last word
     wordscount++;
     
     System.out.println("a) Total number of digits: " + digitcount);
     System.out.println("b) Total number of uppercase letters: " + uppercount);
     System.out.println("   Total number of lowercase letters: " + lowercount);
     System.out.println("c) Total number of alphabets used: " + alphabetcount);
     System.out.println("d) Total number of special characters used: " + specialcharcount);
     System.out.println("e) Total number of vowels: " + vowelcount);
     System.out.println("f) Total number of words: " + wordscount);
     
     sc.close();
 }
 
 public static boolean isVowel(char ch) 
 {
     ch = Character.toUpperCase(ch);
     return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
 }
}