public interface NewsSubject {
    public void attach(Subscriber subscriber);
    public void detach(Subscriber subscriber);
    public String notifySubscribers();
}