package decorator;

public class Hat extends CharacterDecorator {
    /**
     * @param character a character for the hat to be added to
     */
    public Hat(Character character) {
        super(character);
    }
    /**
     * changes the values at the desired index 
     */
    @Override
    public void customize() {
        sections.set(1, "__|    |__");
        sections.set(0, "   ____   ");
    
            
       

        
    }
    
}
