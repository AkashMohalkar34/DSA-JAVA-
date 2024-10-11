import org.w3c.dom.Node;

public class TransformOfSum {
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

    public static int sum(Node root){
        if(root == null){
            return 0;
        }

         int leftsum = sum(root.left);
         int rightsum = sum(root.right);
         
         int data = root.data;

         int newleft = root.left == null ? 0 : root.left.data;
         int newright = root.right == null ? 0: root.right.data;
         root.data = leftsum+ newleft + newright + rightsum ;
         return data;
    }

    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data + "  ");
        preorder(root.left);
        preorder(root.right);
    }
     public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        sum(root);
        preorder(root);
     }
}
