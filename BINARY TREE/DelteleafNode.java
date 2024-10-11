import org.w3c.dom.Node;

public class DelteleafNode {

    public static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data =data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node deletNode(Node root , int x){
        if(root == null){
            return null;
        }
        root.left = deletNode(root.left, x);
        root.right = deletNode(root.right, x);

        if(root.data == x && root.left == null && root.right == null){
            return null;
        }
        return root;
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
        Node root = new Node(10);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(1);
        root.right.left = new Node(3);
        root.right.right = new Node(3);
        root.right.right.right = new Node(3);
        preorder(root);
        deletNode(root, 3);
        System.out.println();
        preorder(root);

}
}