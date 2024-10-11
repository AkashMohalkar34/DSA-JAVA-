public class CountOfNodes {
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

    public static class Buildtree{
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

    public static int countN(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = countN(root.left);
        int righttCount = countN(root.right);
        return leftCount + righttCount + 1;

    }

    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Buildtree tree = new Buildtree();
        Node root = tree.buildTree(nodes);
          System.out.println("Total Number of Node "+countN(root));
    }
}
