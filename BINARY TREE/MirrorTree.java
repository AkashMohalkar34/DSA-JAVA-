public class MirrorTree {

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

    public static Node mirrorT(Node root){
        if(root == null){
            return root;
        }
        Node leftN = mirrorT(root.left);
        Node rightN = mirrorT(root.right);
  
        root.left = rightN;
        root.right = leftN;
        return root;
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+"  ");
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

             preorder(root);
             System.out.println();
             mirrorT(root);
             preorder(root);
             
    }
}
