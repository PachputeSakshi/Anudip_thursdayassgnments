package thursday_assignments;

import java.util.*;
public class Ass8q2_25jan 
{
	    private int bookId;
	    private String title;
	    private String authorName;
	    private double price;
	    private boolean available;

	    // Constructor
	    public Ass8q2_25jan(int bookId, String title, String authorName, double price, boolean available) 
	    {
	        this.bookId = bookId;
	        this.title = title;
	        this.authorName = authorName;
	        this.price = price;
	        this.available = available;
	    }

	    // Getter methods
	    public int getBookId()
	    {
	        return bookId;
	    }

	    public String getTitle()
	    {
	        return title;
	    }

	    public String getAuthorName() 
	    {
	        return authorName;
	    }

	    public double getPrice() 
	    {
	        return price;
	    }

	    public boolean isAvailable() 
	    {
	        return available;
	    }

	    // Method to display book details
	    public void displayBookDetails() throws BookNotAvailableException
	    {
	        if (available) 
	        {
	            System.out.println("Book ID: " + bookId);
	            System.out.println("Title: " + title);
	            System.out.println("Author: " + authorName);
	            System.out.println("Price: $" + price);
	        } 
	        else 
	        {
	            throw new BookNotAvailableException("Book with ID " + bookId + " is not available.");
	        }
	    }

	    // Main method 
	    public static void main(String[] args)
	    {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter book id:");
	    	int bookid=sc.nextInt();
	    	System.out.println();
	    	System.out.println("Enter book name:");
	    	String bookname=sc.next();
	    	System.out.println();
	    	System.out.println("Enter book author:");
	    	String bookauthor=sc.next();
	    	System.out.println();
	    	System.out.println("Enter book price:");
	    	double bookprice=sc.nextDouble();
	    	System.out.println();
	    	System.out.println(" book availability:");
	    	boolean bookavailability =true;
	    	Ass8q2_25jan book1 = new Ass8q2_25jan(bookid, bookname, bookauthor,bookprice, bookavailability);

	        try 
	        {
	            book1.displayBookDetails();
	        } 
	        catch (BookNotAvailableException e)
	        {
	            System.out.println(e.getMessage());
	        }
	    }
	}


