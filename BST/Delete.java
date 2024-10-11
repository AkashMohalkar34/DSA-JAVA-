public class Delete {
    public static class Node{
        int data;
        Node left , right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left, val);

        }
        else{
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        return search(root.left, key) || search(root.right, key);

    }
    public static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data + "  ");
        inorder(root.right);
    }

    
    public static Node delete(Node root , int val)
    {
        
        if(root.data > val){
            root.left = delete(root.left, val);

        }else if(root.data < val){
            root.right = delete(root.right, val);
        }
        else
        {
            if(root.left == null && root.right == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }else{
                return root.left;
            }
            findinordersuccessor(root.right);
            root.data = findinordersuccessor(root.right).data;
            // root.right = delete(root.right,findinordersuccessor(root.right).data);
        } // two children
         
        
        return root;
       
    }
    public static Node findinordersuccessor(Node root){
        while(root != null){
            root = root.left;
        }
        return root;
    }
    public static void main(String args[]){
        int val[] = {7,4,2,1,3,5,6,9,8,10};
        Node root = null;
        for(int i = 0 ; i < val.length;i++){
            root = insert(root, val[i]);
        }

        inorder(root);
        System.out.println(search(root, -5));

    }
}
