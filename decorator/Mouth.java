package decorator;

public class Mouth extends CharacterDecorator{
    /**
     * @param character a character for the mouth to be added to
     */
    public Mouth(Character character) {
        super(character);
    }
    /**
     * changes the values at the desired index 
     */
    @Override
    public void customize() {
        sections.set(5, "\\ ---- /|");

        
    }
    
}
