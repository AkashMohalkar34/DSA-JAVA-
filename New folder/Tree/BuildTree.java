package Tree;

public class BuildTree {

    public static class Node {
        int data;
        Node left , right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int arr[]){
             idx++;

             if(arr[idx] == -1){
                return null;
             }

             Node newNode = new Node(arr[idx]);
             newNode.left = buildTree(arr);
             newNode.right = buildTree(arr);

             return newNode;

        }
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data +"  ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){
         int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(arr);
            preorder(root);
    }
}
