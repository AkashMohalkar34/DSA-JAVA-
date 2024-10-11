import java.util.*;
public class palindrome {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // check Linked list is palindrome or not
    public static Node middle(Node head){
             Node slow = head;
             Node fast = head;
             while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
             }
             return slow;
    }

     public static boolean isPalindrome()
     {
        if(head == null || head.next == null){
            return true;
        }
        Node mid = middle(head);

        // revers the second part
        Node prev = null;
        Node curr = mid;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;


        /// compare
        while(right.next != null){
            if(left.data != right.data){
                 return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
     }

    public static void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node head = null;
    public static void main(String args[])
    {
         head = new Node(1);
         head.next = new Node(2);
         head.next.next = new Node(2);
         head.next.next.next = new Node(1);

         palindrome ll = new palindrome();
         ll.print();
         System.out.println(ll.isPalindrome());
    }
}
