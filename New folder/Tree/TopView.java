import java.util.LinkedList;
import java.util.*;


public class TopView {

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static class Info{
        int hd;
        Node node;

        Info(Node node , int hd){
             this.node = node;
             this.hd = hd;
        }
    }

    public static void topview(Node root){
        Queue <Info> q = new LinkedList<>();
        HashMap<Integer , Node> map = new HashMap<>();

        int min = 0 , max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while(! q.isEmpty()){
            Info currInfo = q.remove();
            if(currInfo == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }

            else{
                
                if(!map.containsKey(currInfo.hd)){
                    map.put(currInfo.hd, currInfo.node);
                }

                if(currInfo.node.left != null){
                     q.add(new Info(currInfo.node.left, currInfo.hd - 1));
                     min = Math.min(min , currInfo.hd - 1);
                }

                if(currInfo.node.right != null){
                    q.add(new Info(currInfo.node.right, currInfo.hd + 1));
                    max = Math.max(max , currInfo.hd + 1);
               }


            }
        }

        for(int i = min ; i <= max ; i++){
             System.out.print(map.get(i).data +"  ");
        }
    }
    public static void main(String args[]){
          Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);

         topview(root);

    }
}
