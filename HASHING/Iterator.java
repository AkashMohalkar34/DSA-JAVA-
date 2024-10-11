import java.util.HashSet;
import java.util.*;

public class Iterator {
    public static void main(String args[]){
     //   HashSet<String> set = new HashSet<>();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Mumbai");
        set.add("Nashik");
        set.add("Ahmednagar");
        set.add("Pune");

        // Iterator it = set.iterator();
        // while(it.hasnext()){
        //     System.out.println(it.next);

        for(String s : set){
            System.out.println(s);
        }
        }
    }

