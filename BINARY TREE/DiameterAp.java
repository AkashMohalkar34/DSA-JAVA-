public class DiameterAp {

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data ){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree{
       static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){

                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }
    }
     public static class Info{
        int diam;
        int ht;
        int sum;
        int count ;
        public Info(int diam , int ht,int sum,int count){
            this.diam = diam;
            this.ht = ht;
            this.sum = sum;
            this.count = count;
        }
     }

     public static Info diameter(Node root){
        if(root == null){
            return new Info(0, 0, 0 , 0);
        }
        Info leftInfo  = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(rightInfo.ht, leftInfo.ht) + 1;
        int sum = rightInfo.sum + leftInfo.sum + root.data;
        int count = rightInfo.count + leftInfo.count + 1;
        return new Info(diam, ht,sum , count);
     }
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1 };
        BinaryTree tree  = new BinaryTree();
        Node root = tree.buildTree(nodes);

         System.out.println(root.data);
        System.out.println("diam  " + diameter(root).diam);
        System.out.println( "sum  " + diameter(root).sum);
        System.out.println("count  "+ diameter(root).count);
    }
}
