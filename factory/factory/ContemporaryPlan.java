package factory;
public class ContemporaryPlan extends HousePlan{
/**
 * @author Anton Aarink
 * CSCE 247 002
 */
    public ContemporaryPlan() {
        super(5,40,3000);
        
    }

   /**
    * adds the given atributes to the arraylist
    */
    public void setMaterials() {
        materials.add("Ceramics");
        materials.add("High-Strength Alloys");
        materials.add("Composites");

        
    }

    /**
    * adds the given atributes to the arraylist
    */
    public void addFeatures() {
        features.add("Oversized Windows");
        features.add("Unconventional Roofs");
        features.add("Minimalism");
        features.add("Open Floor Plan");

        
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
