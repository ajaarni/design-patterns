package factory;
/**
 * @author Anton Aarink
 * CSCE 247 002
 */
public class TinyHomePlan extends HousePlan{

    public TinyHomePlan() {
        super(1,5,200);
        
    }

    /**
    * adds the given atributes to the arraylist
    */
    public void setMaterials() {
        materials.add("Lumber");
        materials.add( "Insulation"); 
        materials.add("Metal Roofing");
        materials.add("Hardware");

        
    }

    /**
    * adds the given atributes to the arraylist
    */
    public void addFeatures() {
        features.add("Natural Light");
        features.add("Creative Storage");
        features.add("MultiPurpose Areas");
        features.add("Multi use applications");

        
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
