package observer;

import java.util.ArrayList;

public class Customer implements Observer {

    private ArrayList<Book> wishList;
    private String firstName;
    private String lastName;
    private Subject subject;

    public Customer(Subject subject, String firstName, String lastName) {
       this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    @Override
    public void display() {
        System.out.println("Wish List: " + wishList);
        
    }

    @Override
    public void update(Book book) {
        if(wishList.size() > 5) {
            for( int i = 5; i < 10; i++) {
                wishList.remove(i);
            }
        }

        
    }

    
    
    
    
    
    
}
