public class AVLtree {
    public static class Node{
        int data, height;
        Node left, right;

        public Node(int data){
            this.data = data;
            height = 1;
        }
    }

    public static Node root;

    // Calcute Height
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

    // right rotate subtree with rooted y

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

    public static Node insert(Node root ,int  key){
        if(root == null){
            return new Node(key);
        }

        if(key < root.data){
            root.left = insert(root.left , key);
        }
        else if(key > root.data){
            root.right = insert(root.right,key);
        }
        else
            return root; ///Duplicate Keys are not Allowed.

        

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
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        preorder(root);
    }
}
