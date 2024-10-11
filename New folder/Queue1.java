import java.util.*;
public class Queue1 {
    public static void main(String args[]){
        Queue<Integer> s = new ArrayDeque<>();
        s.add(1);
        s.add(2);
        s.add(3);

        while(! s.isEmpty()){
            System.out.print(s.peek()+"  ");
            s.remove();
        }

    }
}

