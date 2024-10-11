import java.util.HashMap;
import java.util.*;

public class IterationHashmap {
    public static void main(String args[]){
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("Us", 30);
        hm.put("Pakistan", 30);
        hm.put("China",150);
        hm.put("Nepal", 10);

        Set<String> keys = hm.keySet();

        for (String k : keys) {
            System.out.println("key= "+k +", val ="+ hm.get(k));
            
        }
    }
}
