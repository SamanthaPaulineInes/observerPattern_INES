package LabHw8_INES_3BSCS1_ObserverPattern;

public interface NewsAgencySubject
{
    void subscribe(SubscriberObserver subscriberObserver);
    void unsubscribe(SubscriberObserver subscriberObserver);
    void notifySubscribers(NewsArticle newsArticle);
}
