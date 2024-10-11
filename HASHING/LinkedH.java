import java.util.*;
public class LinkedH {
    public static void main(String args[]){
        LinkedHashMap <String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("Switzerland", 12);
        lhm.put("Nepal", 130);
        lhm.put("China", 123);

        System.out.println(lhm);
        HashMap <String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("Switzerland", 12);
        hm.put("Nepal", 130);
        hm.put("China", 123);
        System.out.println(hm);

    }
}
