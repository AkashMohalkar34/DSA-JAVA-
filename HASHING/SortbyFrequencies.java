import java.util.*;

public class SortbyFrequencies {
    public static void main(String args[]) {

        String str = "aaaccwe";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (a, b) -> a.getValue() == b.getValue() ? a.getValue() - b.getValue() : b.getValue() - a.getValue());


                for(Map.Entry<Character,Integer> e : map.entrySet()){
                    pq.add(e);
                }

                StringBuilder res = new StringBuilder();

                while(! pq.isEmpty()){
                    char ch = pq.poll().getKey();
                    int val = map.get(ch);

                    while (val != 0) {
                        res.append(ch);
                        val--;
                    }
                }

                System.out.println( res.toString());

    }
}
