package strategy;
import java.util.ArrayList;

public class LinearSearch implements SearchBehavior{
    public boolean contains(ArrayList<String> data, String item){
       /**
        * https://www.geeksforgeeks.org/linear-search/
        used to base algorithm
        */
        int n = data.size();

        for(int i = 0; i < n; i++){
            if(data.get(i) == item)
            {
                return true;
            }
        }
        return false;

    }

    
    
}
