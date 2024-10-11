public class Doublyll {
    public class Node{
        int data;
        Node next;
        Node prev;
    
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size ;
    
    // add
    
    public void addFirst(int data){
        
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return ;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }
    // remove
    public int removeFirst()
    {
        if(size == 0){
            System.out.println("DDlinked list is empty ");
            return Integer.MAX_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
         
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;

        return val;

    }


     // add at last

     public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return ;
        }
           tail.next = newNode;
           newNode.prev = tail;
           size++;

     }

     // remove from the last
     public int removeLast(){
        // base
        if(head == null){
            System.out.println("list is emty ");
            return Integer.MAX_VALUE;
        }

        else if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
          Node prev = head;
          for(int  i = 0; i < size - 2;i++){
            prev = prev.next;
          }
           int val = head.data;
          prev.next = null;
          tail.prev = null;
          return val;          
     }
    // print
    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null \n");

    }

    // revers the doubly linked list
    public void reversDll(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String args []){
         Doublyll ll = new Doublyll();
         ll.addFirst(3);
         ll.addFirst(2);
         ll.addFirst(1);
         
         ll.addLast(4);
         ll.print();
        // ll.removeLast();
      //   ll.print();
        //  System.out.println(size);
        //  System.out.println(ll.removeFirst());
        //  ll.print();
        //  System.out.println(size);
        ll.reversDll();
        ll.print();
    }
}
