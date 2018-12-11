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
        this.series = series;
    }

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
        super (pages, released, title, "00000-00000-000000");
        this.month=month;
        this.series=series;
    }
}