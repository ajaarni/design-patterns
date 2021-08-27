package strategy;
import java.util.ArrayList;

public class GuestList{
    private String title;
    private ArrayList<String> people;
    private SearchBehavior searchBehavior;

    public GuestList(String title){
        searchBehavior = new LinearSearch();


    }

    public boolean add(String person){
        return false;

    }

    public boolean remove(String person){
        return false;


    }

    public String getTitle(){
        return "";

    }

    public void setSearchBehavior(SearchBehavior searchBehavior){
        this.searchBehavior = searchBehavior;

    }

    public ArrayList<String> getList(){
        return people;


    }




    
}
