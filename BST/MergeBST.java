import java.util.ArrayList;

public class MergeBST {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void getinorder(Node root , ArrayList < Integer> inorder){
        if(root == null){
            return ;
        }
        getinorder(root.left,inorder);
        inorder.add(root.data);
        getinorder(root.right,inorder);
    }

    public static Node balancedBST(ArrayList<Integer> finalArr,int st , int end){
            if(st > end){
                return null;
            }
            int mid = (st + end)/2;
            Node root = new Node(finalArr.get(mid));
            root.left =  balancedBST(finalArr, st , mid -1);
            root.right = balancedBST(finalArr, mid + 1 , end);

            return root;
    }
    public static Node MergeBST(Node root1 , Node root2){
        // step 1
        ArrayList <Integer> arr1 = new ArrayList<>();
        getinorder(root1,arr1);
        
       ArrayList <Integer> arr2 = new ArrayList<>();
       getinorder(root2, arr2);
       
       // merge
       int i = 0 , j = 0;
       
       ArrayList <Integer> finalArr = new ArrayList<>();
       while(i < arr1.size() && j < arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            }
            else{
                finalArr.add(arr2.get(j));
                j++;
            }
       }
       while(i < arr1.size() ){
        
            finalArr.add(arr1.get(i));
            i++;
        }
        while(j < arr2.size() ){
            finalArr.add(arr2.get(j));
            j++;
        }

        // step 4;
        // sorted array -> balancedBST

       Node root =  balancedBST(finalArr, 0 ,finalArr.size() - 1);
       return root;


    }

    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+"   ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(4);

        Node node = new Node(9);
        node.left = new Node(3);
        node.right = new Node(12);

      Node root1 = MergeBST(root , node);
       preorder(root1);
       
    }
}
