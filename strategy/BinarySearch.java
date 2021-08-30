package strategy;
import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch implements SearchBehavior{
    public boolean contains(ArrayList<String> data, String item){
       /**
        * https://www.geeksforgeeks.org/binary-search-a-string/
        * used to base my algorithm
        */
        /**
         * sorts the array list
         */
        Collections.sort(data);
        /**
         * finds the middle and sorts from there adjusting depending on 
         * if it contians the desired word
         */
         int binarySearch(ArrayList<String> data, String item){
             int left = 0;
             int right = data.size()-1;

             while(left <= right){
                 int mid = left + (right - 1) / 2;
                 int result = item.compareTo(data.get(mid));

                 if (result == 0){
                     return true;
                 }
                    
                else if (result > 0){
                    left = mid + 1;
                }

                else{
                    right = mid - 1;
                }
                 
             }
             return false;

         }
        
    }


        
       
    

    
    
    
}
