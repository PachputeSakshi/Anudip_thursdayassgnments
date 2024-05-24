	    // Custom exception class for book not available


package thursday_assignments;


public class BookNotAvailableException extends Exception 
{
    public BookNotAvailableException(String message)
    {
        super(message);
    }
}