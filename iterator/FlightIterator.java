import java.util.Iterator;
/**
 * @author Anton Aarnink
 * CSCE247 002
 */

public class FlightIterator implements Iterator{

    private Flight[] flights;
    private int position = 0;

    /**
     * initilizes the flights array
     * @param flights array of flights 
     */
    public FlightIterator(Flight[] flights) {
        this.flights = flights;

    }
    
    /**
     * advances to next item
     * @return flight details
     */
    public Flight next() {
        
        Flight flight = flights[position];
        position = position + 1;
        return flight;
        
    }

    /**
     * Checks if array has another item
     * @return
     */
    public boolean hasNext() {

        if(position >= flights.length || flights[position ] == null) {
            return false;
        }
        else {
            return true;
        }
    }

    


    
}
