import java.util.Date;

public class Book
{
    private int pages;
    private Date released;
    private String title;
    private String isbn;

    public int getPages()
    {
        return pages;
    }

    public void setPages(int pages)
    {
        this.pages = pages;
    }

    public Date getReleased()
    {
        return released;
    }

    public void setReleased(Date released)
    {
        this.released = released;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public Book(int pages, Date released, String title, String isbn)
    {
        this.pages = pages;
        this.released = released;
        this.title = title;
        this.isbn = isbn;
    }
}
