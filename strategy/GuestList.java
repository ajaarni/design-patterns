/**
 * @author Anton Aarnink
 * CSCE 247 002
 */
package strategy;
import java.util.ArrayList;

public class GuestList{
    private String title;
    private ArrayList<String> people;
    private SearchBehavior searchBehavior;
/**
 * Setting the default search stratagy to Linear Search
 */
    public GuestList(String title){
        searchBehavior = new LinearSearch();
    }

    public Boolean add(String person){
        if (searchBehavior.contains(people,person)){
            /**
             * @return sets the boolean value to false 
             * triggering the appropriate response
             */
            return false;
         }
        else{
            people.add(person);
            /**
             * @return sets the boolean value to true 
             * triggering the appropriate response
             */
            return true;
        }
    }
    /**
     * class that checks the list for its sotred values 
     * and removes is possible
     */
    public Boolean remove(String person){
        if (searchBehavior.contains(people,person)){
            people.remove(person);
            /**
             * @return sets the boolean value to true 
             * meaning the person was on the list and it was removed
             */
            return true;
         }
        else{
            //people.remove(person);
            /**
             * @return sets the boolean value to false 
             * meaning the person was not on the list and couldn't be removed
             */
            return false;
        }
    }

    public String getTitle(){
        return this.title;

    }
    
    public void setSearchBehavior(SearchBehavior searchBehavior){
        this.searchBehavior = searchBehavior;

    }

    public ArrayList<String> getList(){
        return people;


    }




    
}
