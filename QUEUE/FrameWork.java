import java.util.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class FrameWork {
    public static void main(String[] args) {
       // Queue <Integer> q = new ArrayDeque<>();
        Queue <Integer> q = new LinkedList<>();
       q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
