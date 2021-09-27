/**
 * @author Anton Aarnink
 * CSCE247 002
 */

public class Flight {

    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

    /**
     * @param flightNum Filght Number 
     * @param from Departing location
     * @param to Arival location
     * @param duration Length of flight 
     * @param transfers Number of stops taken by flight 
     */
    public Flight(String flightNum, String from, String to, int duration, int transfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    /**
     * @return flight number variable set in constructor 
     */
    public String getFlightNum() {
        return flightNum;
    }

    /**
     * @return departing location set in constructor
     */
    public String getFrom() {
        return from;
    }

    /**
     * @return arrival location set in constructor
     */
    public String getTo() {
        return to;
    }

    /**
     * @return length of flight set in constructor 
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @return number of stops set in constructor
     */
    public int getNumTransfers() {
        return transfers;
    }
    /**
     * returns formatted data
     */
    public String toString() {
        return "Flight Number: " + flightNum + "\nFrom: " + from + "\nTo: "+ to + "\nDuration: " + duration + " Min\n" + transfers + " transfers";
    }


    
}
