package HeadFirstDesignPatterns.Observer;

/**
 * Created by a.shipulin on 02.04.18.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
