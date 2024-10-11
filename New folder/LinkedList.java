public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;
    public static int size = 0;

    public static boolean isEmpty(){
        return head == null;
    }

    public static void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(isEmpty()){
             head = tail =  newNode;
             return ;
        }
        newNode.next = head;
        head = newNode;
    } 

    // Add at the last of the Linked list
    public static void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(isEmpty()){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void addMiddle(int data , int val){
         Node newNode = new Node(data);
         size++;
         if(isEmpty()){
            head = tail = newNode;
         }

         Node temp = head;
         while(temp.data != val)
         {
            temp = temp.next;
         }
          newNode.next = temp.next;
          temp.next = newNode;

    }


    // Delete from the first of the Linked List

    public static int deleteFirst(){
         if(isEmpty()){
            System.out.println("Linked List Is Empty.");
         }
         int top;
          if(size == 1){
            top = head.data;
            head = tail = null;
            size--;
         }
 
          top = head.data;
         head = head.next;
         size--;

         return top;
    }

    // Delete The Element in the Linked From the Backside
    public static int deleteLast(){

        if(size == 0){
            System.out.println("Linked List are empty");
            return Integer.MIN_VALUE;
        }

        int top;
       if(size == 1){
              top = head.data;
              head = tail = null;
              size--;
              return top;
        }
         Node temp = head;
         for(int i = 0; i <size - 2;i++){
            temp = temp.next;
         }
         top = temp.next.data;
         temp.next = null;
         size--;

         return top;

    }

    //  Search in the Linked List
    public static int Search(int key){

        Node temp = head;
        if(size == 0){
            System.out.println("Linked List are Empty");
            return -1;
        }

        else{
            int i = 1;
            while(temp != null) {
                 if(temp.data == key){
                    return i;
                 }
                 temp = temp.next;
                 i++;
            }

            return -1;
        }
    }
    // Searching Using Recursion

    public static int helper(Node head , int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);

        if(idx == -1){
            return -1;
        }
        return idx + 1;
    }
    public static int recSearch(int key){
        return helper(head,key);
    }



    //  Display Element 
    public static void display(){
         Node temp = head;

         if(temp == null){
            System.out.println("List is Empty");
         }
        //  System.out.println("Node in the Linked List ");
         while(temp != null){
            System.out.print(temp.data +"-->");
             temp = temp.next;
         }
         System.out.print("null");


    }

    // Revers a Linked List
    public static void revers(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
        }

        head = prev;
    }

    public static void deleteNthNode(int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        if(size == n){
            head = head.next;
            return ;
        }
        int i = 0;
        int iTofind = size - n;
        Node prev = head;
        while(i < iTofind){
               prev = prev.next;
               i++;
        }
        prev.next = prev.next.next;
        return ;

    }

    
    public static void main(String args[]){
             LinkedList ll = new LinkedList();
             ll.addFirst(1);
             ll.addFirst(2);
             ll.addFirst(3);
             ll.addFirst(4);
             ll.addFirst(5);
            //  ll.addLast(5);
            //  ll.addMiddle(6, 2);
            // System.out.println(ll.deleteFirst()) ;

            // deleteLast();
            // System.out.println(Search(1));
            // System.out.println(recSearch(1));
             ll.display();
             ll.revers();
             System.out.println();
             ll.deleteNthNode(3);
             ll.display();


    }
}
