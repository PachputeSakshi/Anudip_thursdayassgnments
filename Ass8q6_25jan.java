/*6)Write a program in Java to enter a String/Sentence and display the longest word and the length of the longest word present in the String.
Sample Input: “TATA FOOTBALL ACADEMY WILL PLAY AGAINST MOHAN BAGAN” Sample Output: The longest word: FOOTBALL: The length of the word: 8

*/

package thursday_assignments;

	import java.util.Scanner;

	public class Ass8q6_25jan 
	{
		public static void main(String[] args) 
		{
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter a sentence:");
	        String sentence = sc.nextLine();
	        
	        String[] words = sentence.split(" ");
	        String longestWord = "";
	        int maxLength = 0;
	        
	        for (String word : words)
	        {
	            if (word.length() > maxLength)
	            {
	                maxLength = word.length();
	                longestWord = word;
	            }
	        }
	        
	        System.out.println("The longest word: " + longestWord);
	        System.out.println("The length of the word: " + maxLength);
	        
	        sc.close();
	    }
	}
