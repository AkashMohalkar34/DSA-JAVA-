public class DoublyL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;
    public static int size = 0;


    public static boolean isEmpty(){
        return head == null && tail == null;
    }
    public static void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail =  newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    public static int removeFirst(){
          if(size == 0){
            System.err.println("Linked List is Empty. ");
            return -1;
          }

          if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
          }

          int val = head.data;
          head = head.next;
          head.prev = null;

          return val;

    }

    public static void addLast(int data){
         Node newNode = new Node(data);
         size++;
         if(size == 0){
            head = tail = newNode;
         } 
         tail.next = newNode;
         newNode.prev = tail;
         tail = newNode;
    }



    public static void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"--->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
          DoublyL ll = new DoublyL();
          ll.addFirst(1);
          ll.addFirst(2);
          ll.addFirst(3);
          ll.addFirst(4);

         System.err.println(size);
         print();

        //  ll.removeFirst();
        ll.addLast(5);
         System.out.println();
         print();
        }
}
