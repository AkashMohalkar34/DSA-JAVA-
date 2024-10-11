import java.util.*;

import javax.sound.midi.MidiDevice.Info;

public class LevelOrderT {

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

    public static void leverOrder(Node root){
        Queue<Node> q = new LinkedList<>();

        if(root == null){
            return ;
        }

        q.add(root);
        q.add(null);
        while (! q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }

            else{
                System.out.println(currNode.data+"  ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }

                if(currNode.right != null){
                    q.add(currNode.right);
                }


            }

            
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);

         leverOrder(root);
   
    }
}
