package observer;
/**
 * @author Anton Aarnink
 * CSCE 247 002
 */

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver(Book book);

    
}
