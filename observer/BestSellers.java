package observer;
/**
 * @author Anton Aarink
 * CSCE 247 002
 */

import java.util.ArrayList;

public class BestSellers implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;
    /**
    * initi the best sellers array list
    */
    public BestSellers() {
        bestSellers = new ArrayList<Book>();


    }
    /**
     * register, remove, and notify methods adapted from example code
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);        
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        
    }

    @Override
    public void notifyObserver(Book book) {
        for(Observer observer : observers) {
            observer.update(book);
        }
        
    }

    public void addBook(Book book) {
        bestSellers.add(book);


    }

}
