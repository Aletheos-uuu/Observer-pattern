import java.util.*;

public class MediaCompany {
    public static void main(String[] args) {

        Subscriber sean = new Subscriber();
        sean.setSubscriberName("Sean");

        Subscriber angelyn = new Subscriber();
        angelyn.setSubscriberName("Angelyn");

        Subscriber tricia = new Subscriber();
        tricia.setSubscriberName("Tricia");

        // Add the subscribers to the list
        List<Subscriber> subscriberList = new ArrayList<>();
        subscriberList.add(sean);
        subscriberList.add(angelyn);
        subscriberList.add(tricia);

        // Create the news agency and add the list of subscribers
        NewsAgency agency = new NewsAgency();
        agency.setAgencyName("CNN");
        agency.setBreakingNews("Aliens have landed in Manila");
        agency.setSubscriberList(subscriberList);

        // Notify the subscribers
        System.out.println("Breaking News!");
        System.out.println(agency.notifySubscribers());

        // Remove Juan, add Jerry, and notify with updates
        agency.detach(angelyn);

        Subscriber clark = new Subscriber();
        clark.setSubscriberName("Clark");
        agency.attach(clark);

        // Update the news headline
        agency.setBreakingNews("False alarm, it was a weather balloon");

        // Updates
        System.out.println("Updates recently!");
        System.out.println(agency.notifySubscribers());
    }
}