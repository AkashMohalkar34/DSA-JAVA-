import org.w3c.dom.Node;

public class DiamaterOfTree{


    public static class Node{
        int data;
        Node left , right;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
      }

      public static int diameter(Node root){
         if(root == null){
            return 0;
         }

        int  leftH = diameter(root.left);
        int  rightH = diameter(root.right);
        int leftD = diameter(root.left);
        int rightD = diameter(root.right);


        int selfDia = leftH + rightH + 1;

        return Math.max(Math.max(leftD, rightD),selfDia);
      }
    public static void main(String args[]){
         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);


         System.out.println(diameter(root));
    }
}