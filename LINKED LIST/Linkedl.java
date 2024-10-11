import java.util.LinkedList;
public class Linkedl {
    public static void main(String args []){
        LinkedList <Integer>ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        System.out.println(ll);

        // remove.
        ll.removeLast();
        System.out.println(ll);
    }

}
