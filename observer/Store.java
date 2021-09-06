package observer;
/**
 * @author Anton Aarnink
 * CSCE 247 002
 */

import java.util.LinkedList;
import java.util.Queue;

public class Store implements Observer {
    private Subject subject;
   // private String title;
    private Queue<Book> bestSellers = new LinkedList<>();
    
    public Store(Subject subject) {
        this.subject = subject;
    
        subject.registerObserver(this);

    }

    @Override
    /**
     * adds book to bestsellers list then deletes the values stored past index 5
     */
    public void update(Book book) {
       
           ((LinkedList<Book>) bestSellers).push(book);
       
       if(bestSellers.size() > 5) {
        for( int i = 5; i < 10; i++) {
            ((LinkedList<Book>) bestSellers).pop();
        }    
       }

    }
    @Override
    public void display() {
        System.out.println("Top 5 Best Sellers: " + bestSellers);

        
    }
    
    
}
