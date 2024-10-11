import java.util.*;
import java.util.LinkedList;
public class InterHalves {


    public static void inter(Queue <Integer> q){
        Queue <Integer> q1 = new LinkedList<>();

        for(int i = 0; i < q.size();i++){
            q1.add(q.remove());
        }

        while(!q1.isEmpty()){
            q.add(q1.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        inter(q);

        while(!q.isEmpty()){
            System.out.print(q.remove() + "  ");
        }
    }
}
