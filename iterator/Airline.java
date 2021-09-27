import java.util.Iterator;
/**
 * @author Anton Aarnink
 * CSCE247 002
 */

public class Airline {

    private String title;
    private Flight[] flights;
    private int size = 2;
    private int numberOfItems = 0;

    /**
     * 
     * @param title gives name to airline when adding flights
     */
    public Airline(String title) {
        flights = new Flight[size];
    }

    /**
     * @param flightNum Filght Number 
     * @param from Departing location
     * @param to Arival location
     * @param duration Length of flight 
     * @param transfers Number of stops taken by flight 
     */
    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
        Flight flight = new Flight(flightNum, from, to, duration, transfers);
        
        /**
         * checks to see if the array is filled if it is then it calls grow array then 
         * adds if not then it just adds to griginal array
         */
        if(flights.hasNext()) {
            
            flights[size] = flight;
            size = size + 1;
        }
        else {
            
            
            // new Flight[] flights.growArray(flights);
            // flights[size] = flight;
            // size = size + 1;
        }
    }

    public String getTitle() {
        return title;
        
    }

    /**
     * algorithm based on 
     * https://stackoverflow.com/questions/8438879/expanding-an-array
     * @param flights
     * @return
     */
    public Flight[] growArray(Flight[] flights) {
        Flight[] temp = new Flight[flights.length * 2];
        System.arraycopy(flights, 0, temp, 0, flights.length);
        flights = temp;
        return flights;


    }

    public Iterator createIterator() {
		return new FlightIterator(flights);
	}







}