package decorator;


public class PotatoeHead extends Character {
    /**
     * creates a head outline to be minipulated later on
     */
    public PotatoeHead() {
        sections.add("    ");
        sections.add("   _____");
        sections.add(" /      \\");
        sections.add("|        |");
        sections.add("|        |");
        sections.add(" \\      /");
        sections.add("  \\____/ ");
        
    }
    
    /**
     * prints out just the outline line by line of the array list
     */
    public void draw() {
        for (int i = 0; i < sections.size();i++) {
            System.out.println(sections.get(i)) ;
        }
        
    }
    
    
    
}
