package thursday_assignments;

import java.util.ArrayList;
import java.util.List;

public class Book
{
    public String title;
    private String isbn;
    private List<String> authors;
	
    public Book(String title, String isbn) 
    {
        this.title = title;
        this.isbn = isbn;
        this.authors = new ArrayList<>();
    }

    public String getTitle() 
    {
        return title;
    }

    public String getISBN()
    {
        return isbn;
    }

    public List<String> getAuthors() 
    {
        return authors;
    }

    public void addAuthor(String author) 
    {
        authors.add(author);
    }

    public void removeAuthor(String author)
    {
        authors.remove(author);
    }
}