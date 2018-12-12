import java.util.ArrayList;         //ArrayListe:    benutzt	Bibliothek
import java.util.Date;
import java.util.List;

public class Aufruf
{
    public static void main(String[] args)
    {
                                                                                        //Aufgabe 3
        Date released = new Date ();
        Book buch = new Book (200, released, "My Book", "isbn");    // Der new Operator sorgt dafür,
                                                                                    // dass Speicher für die zu erzeugenden Objekte reserviert wird.

        System.out.println("Das Buch hat " + buch.getPages()+" Seiten, wurde am " +buch.getReleased()+" veröffentlicht und hat den Titel " +buch.getTitle());

                                                                                        //Aufgabe 4
        // Eine ArrayList ist ein Hilfsmittel, um Listen mit sich ändernder Größe zu verwalten.
        // ArrayList: Syntax => ArrayList<String> eineListe = new ArrayList<String>();
                            // In Spitzklammern: Datentyp

        // ArrayList<Integer> eineListe = new ArrayList<Integer>();

        // ArrayList kann keine primitiven Datentypen (int ...) verwalten, sondern nur Objekte
        // =>deshalb Verwendung von Wrapperklassen.

                                        // Wrapperklassen: Wrapperklassen ("Hüllklassen") dienen als
                                        // Verbindungsglied zwischen den Ordinaltypen von Java (byte, short, int, long, float, double, char)
                                        // und den Klassen in Java und dabei insbesondere der Klasse String

        // ArrayList: Listen ausgeben

        List<Book> meineListe=new ArrayList<>();    // anlegen einer ArrayListe
        meineListe.add(new Book(200,released ,"My Book 1", "123215-12521-73473"));  //füllen der Liste mit Daten
        meineListe.add(new Book(200,released,"My Book 2", "6437-623623-24254"));
        meineListe.add(new Book(200,released,"My Book 3", "26326-734737-732473"));
        meineListe.add(new Book(200,released,"My Book 4", "745854-124412-3487438348"));
        meineListe.add(new Book(200,released,"My Book 5", "627-5236236-123483475125"));

        for (Book item:meineListe)  // ArrayList: Listen ausgeben => foreach-Schleife
            // sie wird zum Hoch- oder Runterzählen von Variablen verwendet (for-Schleife) => foreach-Schleife:
            // "eine Weiterentwicklung" -> foreach iteriert also über alle Elemente und ruf den Block auf
            // foreach Schleifen: verwenden aber keine nach außen sichtbare Laufvariable

            // oder Iterator-Objekt, sondern                                    => gibt in jeder Iteration immer direkt den Wert zurück!
        {
            System.out.println(item.getTitle()+" hat " +item.getPages() +" Seiten und folgende ISBN: " +item.getIsbn());    // Ausgeben der Liste
        }

                                                                                        //Aufgabe 5
        List<Paperbook> bestellung=new ArrayList<>();
        bestellung.add(new Paperbook(200, released, "My Paperbook 1", "0", "April"));
        bestellung.add(new Paperbook(210, released, "My Paperbook 2", "0", "April"));
        bestellung.add(new Paperbook(240, released, "My Paperbook 3", "0", "January"));
        bestellung.add(new Paperbook(100, released, "My Paperbook 4", "0", "March"));
        bestellung.add(new Paperbook(140, released, "My Paperbook 5", "0", "October"));

        for (Paperbook item:bestellung) // ArrayList: Listen ausgeben => foreach-Schleife
        {
            System.out.println(item.getTitle()+" hat " +item.getPages() +" Seiten und folgende ISBN: " +item.getIsbn() +" zusätzlich ist es im Monat " +item.getMonth() +" erschienen.");
        }
    }
}