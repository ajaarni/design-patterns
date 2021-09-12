package decorator;

public class Nose extends CharacterDecorator{
    /**
     * 
     * @param character a character for the nose to be added to
     */
    public Nose(Character character) {
        super(character);
    }

    @Override
    /**
     * changes the values at the desired index 
     */
    public void customize() {
        sections.set(4, "|   >    |");

        
    }
    
}
