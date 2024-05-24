//custom exception class for handling attempts to create second object

package thursday_assignments;

public class Singleobj extends Exception 
{
	public Singleobj(String message) 
	{
		super(message);
	}
}
