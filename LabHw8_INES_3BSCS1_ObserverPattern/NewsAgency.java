package LabHw8_INES_3BSCS1_ObserverPattern;
import java.util.ArrayList;
import java.util.List;
public class NewsAgency implements NewsAgencySubject
{
    private List<SubscriberObserver> subscribers = new ArrayList<>();
    @Override
    public void subscribe(SubscriberObserver subscriberObserver)
    {
        subscribers.add(subscriberObserver);
    }
    @Override
    public void unsubscribe(SubscriberObserver subscriberObserver)
    {
        subscribers.remove(subscriberObserver);
    }
    @Override
    public void notifySubscribers(NewsArticle newsArticle)
    {
        for(SubscriberObserver subscriber : subscribers)
        {
            subscriber.update(newsArticle);
        }
    }
    public void publishNews(String title, String content)
    {
        NewsArticle newsArticle = new NewsArticle(title, content);
        notifySubscribers(newsArticle);
    }
}
