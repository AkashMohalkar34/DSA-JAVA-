







public class Linkedlist{
   public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // adding element at first
    public void addFirst(int data)
    {
        // create node
        Node newNode = new Node(data);
        size++;
        // if linked list is empty 
        if(head == null){
            head = tail = newNode;
           return;
        }      

         newNode.next = head;
         head = newNode;
    }  
    
    // adding element at last
    public void addLast(int data)
     {
        
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = null;
            return ;
        }
        tail.next = newNode;

        tail = newNode;   // newNode.next = tail;
     }

     // Adding element in the Middle
     public void addMiddel(int idx , int data)
     {
        if(idx == 0){
            addFirst(data);
            return ;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx - 1){
            temp = temp.next;
            i++;
        }
        newNode.next  = temp.next;
        temp.next = newNode;

     }
     // printting the element in the linked list
     public void printList(){
        Node temp = head;
        if(temp == null){
            System.out.println("There is no node to be Displayed ");
        }
        while(temp != null){
            System.out.print(temp.data + "--->");
            temp= temp.next;

        }
         System.out.println("null");
     }
     // remove the first element in the likedlist
     public int removeFirst(){
        if(size == 0){
            System.out.println("Linked list is Empty.");
            return Integer.MIN_VALUE;
        }
        else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
     }

     // remove last element in the list
     public static int removeLast(){
        if(size == 0){
            System.out.println("linked list is Empty.");
            return Integer.MIN_VALUE;
        }
    else if(size == 1)
    {
        int val = head.data;
        head = null;
        size --;
        return val;
    }
    // for traversing the linked list we using the for loop upto size -2 = prev of tail.
     Node prev = head;   
     for(int i = 0; i < size - 2 ;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        size--;
        return val;
     }

     // for search the element in the linkedlist
     public int itrSearch(int key){
        Node  temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }  

        return -1;

     }

     // search in the element in the linkedlist using recurssion
     public int helper(Node head , int key)
      {
           if(head == null){
              return -1;
           }
            if(head.data == key){
              return 0;
           }

           int idx = helper(head.next , key);
           if(idx == -1){
             return -1;
           }
            return idx + 1; 
      } 
      
      public int recSearch(int key){
        return helper(head , key);
     }

     // revers the linked list using 
     public void revers(){
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

     // delete the Nth node in the linked list
     public int delNthformEnd(int n){
        int sz = 0;
        Node temp = head;
        while(temp != null)
          {
                temp = temp.next;
                sz++;
          }
          // sz - N;
           if(n == sz){
              head = head.next;
              return -1 ;
           }
           int val;
           int i = 1;
           int itofind = sz - n;
           Node prev = head;
           while(i < itofind){
            prev = prev.next;
            i++;
           }
           val = prev.next.data;
           prev.next = prev.next.next;
           System.out.println(val);
           return val;
           
     }
      
     /// check the linked list is palindrome or not
     public static Node findMid(Node head){
        Node slow = head;
        Node fast = head ;
        while(fast != null && fast.next != null)
        {
             slow = slow.next;
             fast = fast.next.next;
        }
        return slow; //slow is my mid
    }
     
    public static boolean checkPalindrome(){
       // base case
       if(head == null || head.next == null){
           return true;
       }
       
           // find out the mid
           Node midNode = findMid(head);
           
           // revers the second part of the list;
    
           Node prev = null;
           Node curr = midNode;
           Node next;
           while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
          }

          Node right = prev;  // head of the right part of linked list
          Node left = head;
          // comparision of each node 
          while(right != null){
           if(left.data != right.data)
           {
               return false;
           }
          
               left = left.next;
               right = right.next;
           
          }
        

       
       return true;

    }


    // finding the cycle is performed in the linked list or not
     
public static boolean isCycle()
     {
       Node slow = head;
       Node fast  = head;
        
       while(fast != null && fast.next != null){
                  slow = slow.next;
                  fast = fast.next.next;
                  if(slow == fast){
                  return true;
               }

       }
         return false;
       }

      
 //////////////////////////////////      // remove the cycle in the linkedlist///////////////////////////////////
       public static void removeCycle(){
        Node slow  = head;
        Node fast  = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                 cycle = true;
                 break;
            }
        }
        if(cycle == false){
            return ;
        }
           /// removing find meeting point
           slow = head;
           Node prev = null;
           while(slow != fast){
              prev = fast;
              slow = slow.next;
              fast = fast.next;
           }
           prev.next = null;
      
       }
       
// MERGE SORT ON THE LINKED LIST 

      public Node getMid(Node head){
                Node slow = head;
                Node fast = head.next;
                while(fast != null && fast.next != null){
                    slow = slow.next;
                    fast  = fast.next;
                }
                return slow; // mid of ll
        }


        public Node merge(Node head1 , Node head2){
            Node newLinedlist = new Node(-1);
            Node temp = newLinedlist;

            while(head1 != null && head2 != null){
                if(head1.data <= head2.data){
                      temp.next = head1;
                      head1 = head1.next;
                      temp = temp.next;
                }
                else{
                    temp.next= head2;
                    head2 = head2.next;
                    temp = temp.next;
                }

                while(head1 != null){
                    temp.next = head1;
                    head1 = head1.next;
                    temp = temp.next;
                }

                while(head2 != null){
                    temp.next = head2;

                    head2 = head2.next;
                    temp = temp.next;
                }
            }
            return newLinedlist.next;
        }
    public Node margeSort(Node head){
               
          if(head == null || head.next == null){
            return head;
          }
          // find mid
          Node mid  = getMid(head);
          // merge sort
             Node rightNode = mid.next;
             mid.next = null;
             Node newLeft = margeSort(head);
             Node newRight = margeSort(rightNode);
          // merge

          return merge(newLeft, newRight);
       }


       public void zigZag(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow; // slow is mid

        // // revers the list from mid to last
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
    while(curr != null)
    {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
     
       }

       // arenging the list
       Node left = head;
       Node right = prev;
       Node nextL, nextR;

       while(left != null && right !=  null ){
          nextL = left.next;
          left.next = right;
          nextR = right.next;
          right.next = nextL;

          // update
          nextL = left;
          nextR = right;
       }




         public static void main(String args []){
     Linkedlist ll= new Linkedlist();
    //   ll.addFirst(1);
    //   ll.addFirst(2);
      // ll.addFirst(2);
     //  ll.addFirst(head);
//  System.out.println(checkPalindrome());
    //    head = new Node(1);
    //    head.next = new Node(2);
    //    head.next.next = new Node(3);
    //    head.next.next.next =  head;
    //    System.out.println(isCycle());

    // head = new Node(1);
    // Node temp = new Node(2);
    // head.next = temp;
    // head.next.next = new Node(3);
    // head.next.next.next = temp;
     
    // System.out.println(isCycle());
    // removeCycle();
    // System.out.println(isCycle());
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
       
        ll.printList();
        ll.head = ll.margeSort(ll.head);
        ll.printList();

}
}