import java.util.Date;

public class Book           // public: Öffentlich sichtbar; Mitglieder der Klasse (d.h.: Eigenschaften, Methoden),
                            // Kind-Klassen und andere Klassen können auf die jeweiligen Mitglieder, die public sind, zugreifen.
{
    private int pages;      // private: Privat sichtbar; Mitglieder können innerhalb von Klassen auf private Mitglieder zugreifen.
                            // Unterklassen können nicht auf die privaten Mitglieder zugreifen.
    private Date released;
    private String title;
    private String isbn;

    public int getPages()                   // Getter UND Setter: Um Attribute dennoch von außen verändern zu können,
                                            // benutzt man Get- und Set-Methoden.
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
