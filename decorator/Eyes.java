package decorator;

public class Eyes extends CharacterDecorator{

    /**
     * 
     * @param character a place for the eyes to be added to
     */
    public Eyes(Character character) {
        super(character);
    }

    /**
     * changes the values at the desired index 
     */
    public void customize() {
        sections.set(3, "|  o   o |");

        
    }

    
}
