public class HeightT {
      public static class Node{
        int data;
        Node left , right;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
      }

      public static int height(Node root){
        if(root == null){
            return 0;
        }

        int rh = height(root.right);
         int lh = height(root.left);
      
         return Math.max(rh,lh) + 1;


    }

    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int lc = countNode(root.left);
        int rc = countNode(root.right);

        return (lc + rc + 1);
    }

    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        return (leftSum + rightSum + root.data);
    }
    public static void main(String args[]){
        Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);
         int h = height(root);
         System.out.println(h);

         System.out.println(countNode(root));
         System.out.println(sum(root));
    }
}
