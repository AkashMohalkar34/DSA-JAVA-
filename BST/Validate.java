import java.util.ArrayList;

public class Validate {


    public static class Node{
        int data;
        Node left;
        Node right;

        public Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left,val);
        }else{
           root.right =  insert(root.right,val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data + "  ");
        inorder(root.right);

    }
  
  
  
    public static void print(ArrayList<Integer> path){
        for(int i = 0 ; i < path.size();i++){
            System.out.print(path.get(i)+"-->");
        }
        System.out.println();
    }
        public static boolean isValid(Node root , Node min , Node max){
            if(root == null){
                return true;
            }
            if(min != null && min.data >= root.data){
                return false;
            }
            else if(max != null && max.data <= root.data){
                return false;
            }
            return isValid(root.left, min, root) && isValid(root.right, root, max);
        }
    public static void main(String[] args) {
        int values[] = {1,1,1};
         Node root = null;
         for(int i = 0; i < values.length ; i++){
            root = insert(root,values[i]);
         }
        
         ArrayList<Integer> path = new ArrayList<>();
         inorder(root);
         System.out.println();
         System.out.println(root.data);

         if(isValid(root, null, null)){
            System.out.println("BST is valid ");
         }else{
            System.out.println("Not Valid ");
         }
}
}



