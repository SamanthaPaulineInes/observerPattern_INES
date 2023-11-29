package LabHw8_INES_3BSCS1_ObserverPattern;
public class Subscriber implements SubscriberObserver
{
    private String name;
    public Subscriber(String name)
    {
        this.name = name;
    }
    @Override
    public void update(NewsArticle newsArticle)
    {
        System.out.print(name + " received breaking news: " + newsArticle.getTitle() + newsArticle.getContent());
    }
}
