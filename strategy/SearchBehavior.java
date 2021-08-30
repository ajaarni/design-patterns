package strategy;
import java.util.ArrayList;
/**
 * requires a contains method in both the search methods 
 */
public interface SearchBehavior {
    public boolean contains(ArrayList<String> data, String item);
    
}
