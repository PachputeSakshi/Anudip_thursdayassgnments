/*Write an application to create a book management system to do the following process :
Add book
Update book
Delete book
add author to each by using collection framework.*/
package thursday_assignments;

import java.util.*;

public class Ass11q1_22feb 
{
    private static List<Book> books = new ArrayList<>();

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nBook Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Update Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice)
            {
                case 1:
                    addBook(sc);
                    break;
                case 2:
                    updateBook(sc);
                    break;
                case 3:
                    deleteBook(sc);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (choice != 4);
        
        sc.close();
    }

    private static void addBook(Scanner sc)
    {
        System.out.print("Enter book title: ");
        String title = sc.next();
        System.out.print("Enter book ISBN: ");
        String isbn = sc.next();

        Book book = new Book(title, isbn);

        System.out.print("Enter number of authors for this book: ");
        int numAuthors = sc.nextInt();
      
        for (int i = 0; i < numAuthors; i++) 
        {
            System.out.print("Enter author name: ");
            String author = sc.nextLine();
            book.addAuthor(author);
        }

        books.add(book);
        System.out.println("Book added successfully!");
    }

    private static void updateBook(Scanner sc) 
    {
        System.out.print("Enter ISBN of the book to update: ");
        String isbn = sc.next();
     

        Book foundBook = findBookByISBN(isbn);
        if (foundBook == null)
        {
            System.out.println("Book with ISBN " + isbn + " not found.");
            return;
        }

        System.out.print("Enter new title for the book: ");
        String newTitle = sc.nextLine();
        foundBook.title = newTitle;

        System.out.println("Book updated successfully!");
    }

    private static void deleteBook(Scanner sc) 
    {
        System.out.print("Enter ISBN of the book to delete: ");
        String isbn = sc.next();

        Book foundBook = findBookByISBN(isbn);
        if (foundBook == null)
        {
            System.out.println("Book with ISBN " + isbn + " not found.");
            return;
        }

        books.remove(foundBook);
        System.out.println("Book deleted successfully!");
    }

    private static Book findBookByISBN(String isbn)
    {
        for (Book book : books) 
        {
            if (book.getISBN().equals(isbn))
            {
                return book;
            }
        }
        return null;
    }
}
