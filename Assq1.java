
/*Have the function ABCheck(str) take the str parameter being passed and return the string true if the characters 
 * a and b are separated by exactly 3 places anywhere in the string at least once (ie. "lane borrowed" 
 * would result in true because there is exactly three characters between a and b). Otherwise return the string false.*/

package Try;

import java.util.*;


public class Assq1 
{
	
	char a;
	int i;
	 public boolean abCheck(String str)
	 {
	      
	        for (int i = 0; i < str.length(); i++)
	        {
	            
	            if (str.charAt(i) == 'a')
	            {
	                if (str.charAt(i+4) == 'b')
	                {
	                    return true;
	                }
	            }
	            
	            else if (str.charAt(i) == 'b') 
	            {
	                
	                if (str.charAt(i + 4) == 'a')
	                {
	                    return true;
	                }
	            }
	        }
	       
	        return false;
	    }
	
	  public static void main (String[] args)
	  {  
		  String str="lane borrowed";
	    
	    Scanner sc =new Scanner(System.in);
	   
	    Assq1 c = new Assq1();
	    System.out.println(c.abCheck(str));
	  }   
	  
}

