import java.util.*;
public class RoottoLeafPath{

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
        public static void printPath(Node root ,ArrayList<Integer> path)
        {
 
             if(root == null){
                return ;
             }
                  
             
            path.add(root.data);
            if(root.left == null && root.right == null){
                print(path);
            }

            printPath(root.left , path);
            printPath(root.right, path);

            path.remove(path.size() - 1);
    }
    public static void main(String[] args) {
        int values[] = {8,5,10,3,6,1,4,11,14};
         Node root = null;
         for(int i = 0; i < values.length ; i++){
            root = insert(root,values[i]);
         }
        
         ArrayList<Integer> path = new ArrayList<>();
         inorder(root);
         System.out.println();
         System.out.println(root.data);
         printPath(root, path);
    }
}

