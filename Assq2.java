/*Have the function LongestWord(sen) take the sen parameter being passed and return the longest word in the string. 
 * If there are two or more words that are the same length, return the first word from the string with that length.
 *  Ignore punctuation and assume sen will not be empty. Words may also contain numbers, for example "Hello world123 567"*/

package Try;

public class Assq2 
{
	 public static String LongestWord(String sen)
	 {
		 String[] words = sen.replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");

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

	        return longestWord;
	    }
	       
	    
	

	public static void main(String[] args) 
	{
		 String sen = "Hello java programming";
	     System.out.println("Longest word: " + LongestWord(sen));
		
	}

}
