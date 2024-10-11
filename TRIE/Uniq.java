public class Uniq{
    static final int MAX = 256;
     
    static final int MAX_WORD_LEN = 500;

    static class Node{
        Node [] child = new Node[MAX];
        int freq;
        Node(){
            freq = 1;
            for(int i = 0 ; i < MAX ; i++)
               child[i] = null;
        }
    }

    static Node root;

    static void insert(String str){
         int len = str.length();
         Node pc = root;

         for(int level = 0; level < len ; level++){
             int idx = str.charAt(level);

             if(pc.child[idx] == null){
                pc.child[idx] = new Node();
             }
             else{
                pc.child[idx].freq++;
             }
         }
    }

    static void findPrefixesUtil(Node root , char[] prefix , int ind){

        if(root == null){
            return ;
        }
        if(root.freq == 1){
            prefix[ind] = '\0';
            int i = 0;

            while (prefix[i] != '\0') 
                   System.out.print(prefix[i++]);
            System.out.print("   ");
            return ;
            
        }
        for(int i  = 0 ; i <MAX; i++){
            if(root.child[i] != null){
                prefix[ind] =  (char) i;
                 findPrefixesUtil(root.child[i], prefix, ind + 1);
            }
        }
    }

    static void findPrefixes(String arr[] , int n){
        root = new Node();
        root.freq = 0;
        for(int i = 0; i < n;i++){
            insert(arr[i]);
        }


        char[] prefix = new char[MAX_WORD_LEN];

        findPrefixesUtil(root, prefix, 0);
    }

    public static void main(String args[]){
        String arr[] = {"zebra" , "dog" , "duck" , "dove"};
        int n = arr.length;
        findPrefixes(arr, n);
    }
}