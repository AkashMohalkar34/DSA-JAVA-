import java.util.*;
public class Hashmap{
    public static void main(String args[]){
        HashMap<String ,Integer> hm = new HashMap<>();

        // add -> 0(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US" , 50);

        System.out.println(hm);

        // Get -> o(1)
      // int population = hm.get("india");
        System.out.println(hm.get("India"));

        // ContainsKay

        System.out.println(hm.containsKey("India")); // true.
        System.out.println(hm.containsKey("Indonesia")); // False'

        System.out.println(hm.remove("China"));
        System.out.println(hm.remove("US"));
        System.out.println(hm);

        // size

        System.out.println(hm.size());
        System.out.println(hm);

        // isEmpty
        System.out.println(hm.isEmpty());
        // clear
        hm.clear();
        System.out.print(hm);
        System.out.println(hm.isEmpty());

    }
}