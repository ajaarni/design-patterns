package factory;
import java.util.ArrayList;
/**
 * @author Anton Aarink
 * CSCE 247 002
 */

public abstract class HousePlan extends HousePlanFactory {

   protected ArrayList<String> materials;
   protected ArrayList<String> features;
   private int numRooms;
   private int numWindows;
   private int squareFeet;
/**
 * 
 * @param numRooms number of rooms in given house type
 * @param numWindows number of windows in given house type
 * @param squareFeet square footage in given house type 
 */
   public HousePlan(int numRooms, int numWindows, int squareFeet) {
       this.numRooms = numRooms;
       this.numWindows = numWindows;
       this.squareFeet = squareFeet;
       
   }

   public abstract void setMaterials();
   public abstract void addFeatures();
/**
 * 
 * @return getter for materials arraylist
 */
   public ArrayList<String> getMaterials () {
       return materials;
   }
/**
 * 
 * @return getter for features arraylist
 */
   public ArrayList<String> getFeatures() {
       return features;
   }
/**
 * 
 * @return number of rooms
 */
   public int getNumRooms() {
       return numRooms;
   }

/**
 * 
 * @return number of windows 
 */
   public int getNumWindows() {
       return numWindows;
   }

/**
 * 
 * @return amount of square footage 
 */
   public int getSquareFeet() {
       return squareFeet;
   }
/**
 * @return concatonated data on house
 */
   public String toString() {
    String result =  "Square Feet: " + squareFeet + "\n" + "Rooms: "+ numRooms + "\n" + "Windows: " + numWindows ;
       return result;

   }
    
    
}
