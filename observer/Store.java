package observer;

import java.util.Queue;

public class Store implements Observer {
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;
    
    public Store(Subject subject) {

    }
    
    @Override
    public void update(Book book) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void display() {
        // TODO Auto-generated method stub
        
    }
    
    
}
