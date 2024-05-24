/*3. write a program to create Book management system.using linked list
create class name Book,and perform following actions:
Attributes:
bookid,bookName,bookPrice,authorName,library name(static),availability]
method:
createBook() will store book details.(add  3 books).
deleteBook() will delete book by Id
displayBook()will display book details
*/

package thursday_assignments;
import java.util.LinkedList;
import java.util.Scanner;

class Book 
{
    int bookId;
    String bookName;
    double bookPrice;
    String authorName;
    static String libraryName = "MyLibrary";
    boolean availability;

    public Book(int bookId, String bookName, double bookPrice, String authorName)
    {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.authorName = authorName;
        this.availability = true; // Initially set as available
    }

    public String toString()
    {
        return "Book ID: " + bookId + ", Book Name: " + bookName + ", Price: $" + bookPrice + ", Author: " + authorName + ", Availability: " + (availability ? "Available" : "Not Available");
    }
}

public class Ass9q3_9feb 
{
    LinkedList<Book> bookList;

    public Ass9q3_9feb()
    {
        bookList = new LinkedList<>();
    }

    public void createBook()
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");
            System.out.print("Enter Book ID: ");
            int bookId = sc.nextInt();

            System.out.print("Enter Book Name: ");
            String bookName = sc.nextLine();
            System.out.print("Enter Book Price: ");
            double bookPrice = sc.nextDouble();

            System.out.print("Enter Author Name: ");
            String authorName = sc.nextLine();

            Book book = new Book(bookId, bookName, bookPrice, authorName);
            bookList.add(book);
        }
    }

    public void deleteBook(int bookId) 
    {
        for (Book book : bookList) 
        {
            if (book.bookId == bookId) 
            {
                bookList.remove(book);
                System.out.println("Book with ID " + bookId + " has been deleted.");
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    public void displayBooks()
    {
        if (bookList.isEmpty()) 
        {
            System.out.println("No books available.");
            return;
        }
        System.out.println("List of Books in " + Book.libraryName + ":");
        for (Book book : bookList)
        {
            System.out.println(book);
        }
    }

    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	Ass9q3_9feb library = new Ass9q3_9feb();
        library.createBook();
        library.displayBooks();

        // delete book 
        System.out.println("Enter book number you want to delete:");
        int n=sc.nextInt();
        library.deleteBook(n);
        library.displayBooks();
    }
}


