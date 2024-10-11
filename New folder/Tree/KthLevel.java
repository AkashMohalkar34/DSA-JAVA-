public class KthLevel{

    public static class Node{
        int data;
        Node left , right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void kthlevelE(Node root, int level , int n ){
        if(root == null){
            return ;
        }

        if(level == n){
            System.out.print(root.data+"   ");
            return ;
        }
        kthlevelE(root.left, level + 1, n);
        kthlevelE(root.right, level + 1, n);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);

         kthlevelE(root, 0, 2);


    }
}