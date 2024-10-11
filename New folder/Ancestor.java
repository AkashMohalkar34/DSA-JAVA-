import java.util.ArrayList;

public class Ancestor {

    public static class Node{
        int data;
        Node left ,right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean getpath(Node root , int n , ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);

        if(root.data == n){
            return true;
        }


        boolean findLeft = getpath(root.left, n, path);
        boolean findRight = getpath(root.right, n, path);

        if(findLeft || findRight){
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node root , int n1 , int n2){
         ArrayList <Node> path1 = new ArrayList<>();
         ArrayList <Node> path2 = new ArrayList<>();

         getpath(root,n1,path1);
         getpath(root,n1,path1);


         int i = 0;
         for( i = 0 ; i < path1.size() && i < path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
         }

         Node ancesotor = path1.get(i);
         return ancesotor;
    }
    public static void main(String args[]){
         Node root = new Node(1);
              root.left = new Node(2);
              root.right = new Node(3);
              root.left.left = new Node(4);
              root.left.right = new Node(5);

              root.right.left = new Node(6);
              root.right.right = new Node(7);

              System.out.println(lca(root, 4, 5).data);
              
  
  
            }
}
