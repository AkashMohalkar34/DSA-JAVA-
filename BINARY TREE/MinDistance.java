public class MinDistance {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node lca(Node root , int n1 , int n2){
        if(root == null || root.data == n2 || root.data == n1){
            return root;
        }
        
        Node leftlca = lca(root.left , n1 , n2);
        Node rightlca = lca(root.right , n1 , n2);

        if(leftlca == null){
            return rightlca;
        }

        if(rightlca == null){
            return leftlca;
        }
        return root;
    }

    public static int lcadist(Node root , int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftlca = lcadist(root.left, n);
        int rightlca = lcadist(root.right, n);

        if(leftlca == -1 && rightlca == -1){
            return -1;
        }
        else if(leftlca == -1){
            return rightlca + 1;
        }else{
            return leftlca + 1;
        }
    }
    public static int minDist(Node root , int n1 , int n2){
        Node lca = lca(root, n1, n2);
        int dist1 = lcadist(lca , n1);
        int dist2 = lcadist(lca , n2);
    

        return dist1 + dist2;
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(minDist(root, 4, 6));
    }
}
