package LabHw8_INES_3BSCS1_ObserverPattern;
public class NewsArticle
{
    private String title;
    private String content;

    public NewsArticle(String title, String content)
    {
        this.title = title;
        this.content = content;
    }
    public String getTitle()
    {
        return title;
    }
    public String getContent()
    {
        return content;
    }
}
