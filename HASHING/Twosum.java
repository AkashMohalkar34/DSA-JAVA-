import java.util.*;
public class Twosum {

    public static void main(String args[]){

    
          int arr[] ={2,7,6,8};
          HashMap<Integer, Integer > map = new HashMap<>();
          int target = 9;

          for(int i = 0 ; i < arr.length; i++){
                 int diff = target - arr[i];

                 if(map.containsKey(diff)){
                       System.out.print(i+"  " +map.get(diff));
                 }

                 map.put(arr[i], i);
          }
    }
}
