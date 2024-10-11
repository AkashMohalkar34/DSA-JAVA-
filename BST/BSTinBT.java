public class BSTinBT {
    public static class Node {
         int data;
         Node left,right;

         public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
         }
    }
    public static class Info{
        boolean isBST;
        int size, max , min;
        public Info(boolean isBST, int size , int min , int max){
            this.max = max;
            this.min = min;
            this.isBST = isBST ;
            this.size = size;
        }
    }

    public static int maxBST = 0;
    public static Info findBST(Node root){
        if(root == null){
            return new Info(true,0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftInfo = findBST(root.left);
        Info rightInfo = findBST(root.right);
        int size = rightInfo.size + leftInfo.size + 1;
        int max = Math.max(root.data,Math.max(leftInfo.max, rightInfo.max));
        int min = Math.min(root.data,Math.max(leftInfo.min,rightInfo.min));

        if(root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false, size, min, max);
        }
        if(leftInfo.isBST && rightInfo.isBST){
            maxBST = Math.max(size, maxBST);
            return new Info(true,size,min,max);
        }

        return new Info(false, size, min, max);
    }
    public static void main(String args[]){
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.right = new Node(20);
        root.left.left = new Node(5);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        findBST(root);
        System.out.println(maxBST);
    }
}
