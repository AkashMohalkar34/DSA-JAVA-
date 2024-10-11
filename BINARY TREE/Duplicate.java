import org.w3c.dom.Node;
import java.util.*;

public class Duplicate {

    static HashMap<String ,Integer> m ;
    public static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public static String inorder(Node root){
        if(root == null){
            return " ";
        }

        String str = "(";
        str += inorder(root.left);
        str += Integer.toString(root.data);
        str += inorder(root.right);
        str += ")";

        if(m.get(str) != null && m.get(str) == 1){
            System.out.println(root.data +" ");
        }
        if(m.containsKey(str))
        {
            m.put(str,m.get(str)+1);
        }
        else{
            m.put(str, 1);
        }

        return str;
    }

    static void printDupl(Node root){
        m = new HashMap<>();
        inorder(root);
    }
     public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(2);
        root.right.left = new Node(3);
        root.right.right = new Node(4);
        printDupl(root);
}
}
