package LabHw8_INES_3BSCS1_ObserverPattern;
import java.util.Scanner;
public class NewsSubscriptionSystem
{
    public static void main(String[] args)
    {
        Scanner news = new Scanner(System.in);

        System.out.print("\nWELCOME TO REAL-TIME NEWS SUBSCRIPTION SERVICE");
        System.out.print("\nINES, SAMANTHA PAULINE | 3 BSCS 1 | LAB 8: OBSERVER PATTERN");

        NewsAgency newsAgency = new NewsAgency();

        System.out.print("\n\n===========================================================");

        System.out.print("\n\nBREAKING NEWS");

        Subscriber subscriber1 = new Subscriber("\n\nHarry (Subscriber 1): ");
        Subscriber subscriber2 = new Subscriber("Hermoine (Subscriber 2): ");
        Subscriber subscriber3 = new Subscriber("Ron (Subscriber 3): ");
        Subscriber subscriber4 = new Subscriber("Draco (Subscriber 4): ");

        newsAgency.subscribe(subscriber1);
        newsAgency.subscribe(subscriber2);
        newsAgency.subscribe(subscriber3);
        newsAgency.subscribe(subscriber4);

        newsAgency.publishNews("\n  Breaking News 1\n", "       - Mr. and Mrs. Weasly's car caught flying in muggle world.\n");
        newsAgency.unsubscribe(subscriber1);
        newsAgency.publishNews("\n  Breaking News 2\n", "     - Sirius Black escaped from Azkaban!\n");
        newsAgency.unsubscribe(subscriber4);
        newsAgency.publishNews("\n  Breaking News 3\n", "     - Dumbledore kicked out as headmaster of Hogwarts.\n");
    }
}
