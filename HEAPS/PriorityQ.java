import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQ{
    public static void main(String args[]){
        PriorityQueue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // Descending Sequence

        //PriorityQueue <Integer> pq = new PriorityQueue<>();       // Ascending order 
        
        pq.add(4);
        pq.add(2);
        pq.add(3);
        pq.add(7);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}