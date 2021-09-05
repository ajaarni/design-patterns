package observer;
/**
 * @author Anton Aarnink
 * CSCE 247 002
 */

public class Book  {

   
    private String title;
    private String authorFirstName;
    private String authorLastName;
/**
 * Initilizes the Book and load vaules
 * @param title title of the book
 * @param authorFirstName authors first name
 * @param authorLastName authors last name 
 */
    public Book(String title, String authorFirstName, String authorLastName)
    {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }
/**
 * Simple 'getters'
 * @return The title of the book
 * @return authors name 
 */
    public String getTitle() {
        return title;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }
    /**
     * @return Book details
     */
    public String toString() {
        return title + authorFirstName + authorLastName;
        
    }



}