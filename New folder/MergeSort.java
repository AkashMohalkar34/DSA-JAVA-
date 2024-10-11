public class MergeSort {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head = null;

    public static void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node getmid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow =slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Node merge(Node head1 , Node head2){
        Node mergell = new Node(-1);
        Node temp = mergell;

        while (head1 != null && head2 != null) {
             if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
             }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
             }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergell.next;
    }
    public static Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node midNode   = getmid(head);
        Node righthead = midNode.next;
        midNode.next  = null;
        Node leftNode  = mergeSort(head);
        Node rightNode = mergeSort(righthead);

        return merge(leftNode , rightNode);

    }
    public static void main(String args[]){
        head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        
        print();;
        mergeSort(head);
    }
}
