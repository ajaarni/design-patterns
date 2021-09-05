package observer;

import java.util.LinkedList;
import java.util.Queue;

public class Store implements Observer {
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers = new LinkedList<>();
    
    public Store(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);

    }

    @Override
    public void update(Book book) {
        //if(book.equals())        
    }
    @Override
    public void display() {
        System.out.println("Top 5 Best Sellers: " + bestSellers);

        
    }
    
    
}
