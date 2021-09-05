package observer;
/**
 * @author Anton Aarnink
 * CSCE 247 002
 */

import java.util.ArrayList;

public class Customer implements Observer {

    private ArrayList<Book> wishList;
    private String firstName;
    private String lastName;
    private Subject subject;

    /**
     * 
     * @param subject who
     * @param firstName first name of customer
     * @param lastName last name of customer
     */
    public Customer(Subject subject, String firstName, String lastName) {
        wishList = new ArrayList<Book>();
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    @Override
    /**
     * prints out the contents of the wish list 
     */
    public void display() {
        System.out.println("Wish List: " + wishList);
        
    }

    @Override
    /**
     * removes the extra books on the wish list keeping it at 5
     */
    public void update(Book book) {
        if(wishList.size() > 5) {
            for( int i = 5; i < 10; i++) {
                wishList.remove(i);
            }
        }

        
    }

    
    
    
    
    
    
}
