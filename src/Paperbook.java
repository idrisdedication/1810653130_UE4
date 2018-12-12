import java.util.Date;

public class Paperbook extends Book
{
    private String series;
    private String month;

    public String getSeries()
    {
        return series;
    }

    public void setSeries(String series)
    {
        this.series = series;       // this (Schlüsselwort) liefert auch nichts anderes als
                                    // eine Referenz und zwar eine Referenz auf das Objekt, in dem wir uns befinden.
    }   // Das Schlüsselwort this liefert eine Referenz auf den Speicherbereich, in dem ein Objekt gespeichert ist zurück.

    public String getMonth()
    {
        return month;
    }

    public void setMonth(String month)
    {
        this.month = month;
    }

    public Paperbook(int pages, Date released, String title, String series, String month)
    {
        super (pages, released, title, "00000-00000-000000"); // Um den Konstruktor der Basisklasse aufzurufen, wird die Methode super() verwendet.
                                                                    // Sie wird im Konstruktor der Subklasse verwendet.
                                                                     // super() wird benutzt, um private-Elemente der Basisklasse anzusprechen.
        this.month=month;
        this.series=series;
    }                                                                           // super() ruft hier den Konstruktor von Paperbook auf
}                                                                               // => und könnte somit private-Elemente manipulieren.
// Wir verwenden das Schlüsselwort super in drei Szenarien:

                //1.    Um den Java Konstruktor einer Oberklasse zu verwenden!
                //2.    Um die Methode einer Oberklasse aufzurufen!
                //3.    Um Namenskonflikte in einer Vererbungshierarchie aufzulösen!