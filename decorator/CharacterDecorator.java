package decorator;

public abstract class CharacterDecorator extends Character{
    protected Character character;
    /**
     * 
     * @param character instance of a type of character 
     */
    public CharacterDecorator(Character character) {
        super();
        this.character = character;
       // character.sections = this.sections;
        for (int i = 0; i < sections.size(); i++)
        {
            sections.get(i);
        }
        customize();
    }

    public abstract void customize();
    
}
