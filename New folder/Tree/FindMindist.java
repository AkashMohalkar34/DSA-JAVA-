import java.util.*;
public class FindMindist {
   
    public static class Node{
        int data;
        Node left , right;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static boolean getPath(Node root , int n , ArrayList<Node> path){
         if(root == null){
            return false;
         }
         path.add(root);
         if(root.data == n){
             return true;
         }

         boolean foundleft =  getPath(root.left , n ,path);
         boolean foundright = getPath(root.right , n ,path);

         if(foundleft || foundright){
            return true;
         }

         path.remove(path.size() - 1);
         return false;
    }
    public static Node lca(Node root , int n1 , int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root , n1 , path1);
        getPath(root , n2 , path2);


        int i = 0;
        for( i = 0 ; i < path1.size() && i < path2.size(); i++){
             if(path1.get(i) != path2.get(i)){
                break;
             }
        }

        Node lca = path1.get(i -1);

        return lca;

    }

    public static int lcaDist(Node root , int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }

        int leftd = lcaDist(root.left, n);
        int rightd = lcaDist(root.right, n);

        if(leftd == -1 && rightd == -1){
            return -1;
        }
        else if(leftd == -1){
            return rightd + 1;
        }
        else{
            return leftd + 1;
        }
    }

    public static int mindist(Node root , int n1, int n2){
         Node lca = lca(root, n1, n2);

         int dist1 = lcaDist(lca, n1);
         int dist2 = lcaDist(lca, n2);
         return dist1 + dist2;
    }

    public static void main(String args[]){
          Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);


         System.out.println(mindist(root, 4, 6));

    }
}


