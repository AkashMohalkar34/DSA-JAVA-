import java.util.TreeMap;

public class TreeHMap {
    public static void main(String args[]){
        TreeMap<String , Integer> tm = new TreeMap<>();
        tm.put("India",100);
        tm.put("SW",10);
        tm.put("US",70);

        System.out.println(tm);
    }
}
