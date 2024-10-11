import java.util.ArrayList;
import java.util.LinkedList;

public class ImplementationHashMap {

    public static class HashMap<K,V>{
        public class Node{
            K key;
            V val;
            public Node(K key , V val){
                this.key = key;
                this.val = val;
            }
        }
            public LinkedList<Node> buckets[] ;
            private int n;
            private int N;

            @SuppressWarnings("unchecked")
            public HashMap(){
                this.N = 4;
                this.buckets = new LinkedList[4];
                for(int i = 0 ; i < 4; i++){
                    this.buckets[i] = new LinkedList<>();
                }
            }

            public int hashFunction(K key){
                int hc = key.hashCode();
                return Math.abs(hc) % N;
            }

            public int searchInLL(K key , int bi){

                LinkedList<Node>  ll = buckets[bi];
                int di = 0;
                for(int i = 0 ; i < ll.size(); i++ ){
                     Node node = ll.get(i);
                     if(node.key == key){
                         return di;
                     }
                     di++;
                }
                return -1;
            }

            @SuppressWarnings("unchecked")
            public void rehash(){
                LinkedList<Node> oldBucket[] = buckets;
                buckets = new LinkedList[2 * N];
                N = 2  * N;
                for(int i = 0 ; i < buckets.length; i++){
                    buckets[i] = new LinkedList<>();
                }

                // node -> add in bucket
                for(int i = 0 ; i < oldBucket.length ; i++){
                        LinkedList<Node> ll = oldBucket[i];
                        for(int j = 0 ;  j < ll.size(); j++){
                            Node node = ll.remove();
                            put(node.key , node.val);
                        }
                }
                
            }
            public void put(K key , V val){
                int bi = hashFunction(key);
                int di = searchInLL(key , bi);

                if(di != -1){
                    Node node = buckets[bi].get(di);
                    node.val = val;
                }
                else{
                    buckets[bi].add(new Node(key,val));
                    n++;
                }

                 double lambda = (double)n/N;
                 if(lambda > 2.0){
                    rehash(); 
                 }
            }

           public boolean containsKey(K key){
               int bi = hashFunction(key);
               int di = searchInLL(key, bi);

               if(di != -1){
                return true;
               }
               else{
                return false;
               }
           }    
           public V getV(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di != -1){
                Node node = buckets[bi].get(di);
                return node.val;
              }
              else{
                return null;
              }
            }

            public V remove(K key)
           {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di != -1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.val;
            }
            else{
                return null;
            }
           }

           public ArrayList<K> keySet(){
               ArrayList<K> keys = new ArrayList<>();

               for(int i = 0 ; i < buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
                
               }
               return keys;
           }

           public boolean isEmpty()
           {
            return n == 0;
        }

        
    }
    public static void main(String args[]){
           HashMap<String ,Integer> hm = new HashMap<>();
           hm.put("India ", 100);
           hm.put("China ", 150);
           hm.put("Nepal ", 5);
           hm.put("Us ", 10);


           ArrayList<String> keys = hm.keySet();

           for (String key : keys) {
            System.out.println(key);
            
           }
        //    for(int i = 0 ; i < keys.size(); i++){
        //          System.out.println(keys.get(i));
        //    }
        System.out.println(hm.getV("India"));
        System.out.println(hm.isEmpty());
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.remove("Nepal"));
           
        }
}
