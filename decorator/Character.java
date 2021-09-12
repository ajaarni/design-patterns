package decorator;

import java.util.ArrayList;

public abstract class Character {

    protected  ArrayList<String> sections;
    /**
     * initilizes the Array List
     */
    public Character() {
        sections = new ArrayList<String>();

    }
    /**
     * prints line by line of the array list 
     */
    public void draw() {
        for (int i = 0; i < sections.size();i++) {
            System.out.println(sections.get(i)) ;
        }
    }
    
}
