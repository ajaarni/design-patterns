package factory;
/**
 * @author Anton Aarink
 * CSCE 247 002
 */
public abstract class HousePlanFactory {
    /**
     * 
     * @param type asks the type of house being created
     * @return the house plan for each given type of house 
     */
    public  HousePlan createHousePlan(String type) {
        if(type.equals("log cabin")) {
            return new LogCabinPlan();
        } else if(type.equals("tiny home")) {
            return new TinyHomePlan();
        } else if(type.equals("contemporary home")) {
            return new ContemporaryPlan();
        }
        return null;
            
    }


}
