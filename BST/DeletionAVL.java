public class DeletionAVL {
    
    public static class Node{
        int data;
        int height; 
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            height = 1;
            left = right = null;
        }
    }



    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return root.height;
    }

    // calculate the Balance Factor
    public static int balanceFac(Node root){
             if(root == null){
                return 0; 
             }
             return Math.max(height(root.left), height(root.right));
    }

public static Node rightRotate(Node y){
        Node x = y.left;
        Node T2 = x.right;

        // rotation
        x.right = y;
        y.left = T2;

        // update height;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return x;
    }
    // left rotate subtree with root x;
    public static Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;

        // rotate
        y.left = x;
        x.right = T2;

        // update the height;
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));

        // return updataed root;

        return y;
    }


    public static Node getMinSu(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static Node deleteNode(Node root, int key){
        if(root == null){
            return root;
        }
        if(key < root.data){
            root.left = deleteNode(root.left, key);
        }
        else if(key > root.data){
            root.right = deleteNode(root.right, key);
        }
        else{
            // no child
            if(root.left == null && root.right == null){
                return null;
            }
            
            // When one Child
            if(root.left == null ){
                return root.right; 
            }
            else{
                return root.left;
            }

            // Two Child
             Node temp = getMinSu(root.right);
             root.data = temp.data;
             root.right = deleteNode(root.right, key);
        }

        root.height = 1 + Math.max(height(root.left) , height(root.right));

        int bf = balanceFac(root);

        if(bf > 1 && key < root.left.data){
            return rightRotate(root);
        }
        if(bf < -1 && key > root.right.data){
            return leftRotate(root);
        }

        if(bf > 1 && key > root.left.data){
            root.left = leftRotate(root);
            return rightRotate(root);
        }

        if(bf < -1 && key < root.right.data){
            root.right = rightRotate(root);
            return leftRotate(root);
        }

    
        return root;

    }

    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+"  ");
        preorder(root.left);
        preorder(root.right);
    }
      public static void main(String args[]){

        Node root = new Node(20);
        root.left = new Node (10);
        root.right = new Node(40);
        root.right.left = new Node(30);
        root.right.right = new Node(50);

        deleteNode(root, 10);
        preorder(root);
      }
}
