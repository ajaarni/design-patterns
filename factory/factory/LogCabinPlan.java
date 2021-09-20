 package factory;
 /**
 * @author Anton Aarink
 * CSCE 247 002
 */

public class LogCabinPlan extends HousePlan {


    public LogCabinPlan() {
        super(2,10,1800);
        
    }

    /**
    * adds the given atributes to the arraylist
    */
    public void setMaterials() {
        materials.add("Log Siding");
        materials.add( "Board and Batten Siding"); 
        materials.add("White Pine");
        
    }

    /**
    * adds the given atributes to the arraylist
    */
    public void addFeatures() {
        features.add("Timbered Roof");
        features.add("High Insulation");
        features.add("Rustic Effect");
        
    }
    /**
     * loops through the array lists and returns each value 
     */
    public String toString() {
        super.toString();
        for(int i = 0; i < materials.size();i++) {
           return materials.get(i);
        }

        for(int j = 0; j < features.size();j++) {
            return features.get(j);
         }
        
        return null;
        
    }
    
}
