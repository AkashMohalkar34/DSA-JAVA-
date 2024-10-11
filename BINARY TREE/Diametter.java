public class Diametter {
    
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
         public static int height(Node root){
            if(root == null){
                return 0;
            }
            int leftheight = height(root.left);
            int rightHeight = height(root.right);

            return leftheight + rightHeight + 1;
         }
        
         public static int diameter(Node root){
            if(root == null){
                return 0;
            }
            int leftDiameter = diameter(root.left);
            int leftheight = height(root.left);
            int rightDiameter = diameter(root.right);
            int rightHeight = height(root.right);

            int selfDaimeter = leftheight+ rightHeight;
            int maxDiameter = Math.max(selfDaimeter , Math.max(rightDiameter, leftDiameter));
            return maxDiameter;
         }
    
        public static void main(String args[]){
            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            Buildtree tree = new Buildtree();
            Node root = tree.buildTree(nodes);
              System.out.println("Diameter of the tree : "+diameter(root));
        }
    }
    

