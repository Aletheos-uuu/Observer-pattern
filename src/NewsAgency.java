import java.util.List;

public class NewsAgency implements NewsSubject {

    private String agencyName;
    private String breakingNews;
    private List<Subscriber> subscriberList;

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getBreakingNews() {
        return breakingNews;
    }

    public void setBreakingNews(String breakingNews) {
        this.breakingNews = breakingNews;
    }

    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }

    @Override
    public void attach(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void detach(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public String notifySubscribers() {
        String output = new String();
        for (Subscriber subscriber : subscriberList) {
            output += "Hey, " + subscriber.getSubscriberName() + "!\n";
            output += agencyName + " reports: " + breakingNews + "!\n\n";
        }
        return output;
    }
}