import java.util.*;

public class KAncestor {

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int Kancestor(Node root , int n1 , int k){
        if(root == null){
            return -1;
        }
        if(root.data == n1){
            return 0;
        }
        int leftDist = Kancestor(root.left, n1, k); 
        int rightDist = Kancestor(root.right, n1, k); 

        int max = Math.max(leftDist, rightDist);
        if(max + 1 == k){
            System.out.println(root.data);
        }
        return max +1;
    }
     public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.print(Kancestor(root, 5, 2));

}
}
