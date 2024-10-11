import java.util.HashSet;

public class UAndIntersection {
    
     public static void main(String args[]){
        int arr1[] ={7,3,9};
        int arr2[] ={6,3,9,2,9,4};

        HashSet < Integer> set = new HashSet<>();
        for(int i = 0; i < arr1.length ; i++){
             set.add(arr1[i]);
        }
        for(int i = 0 ; i < arr2.length ; i++){
            set.add(arr2[i]);
        }

        System.out.println(set.size());
        System.out.println(set);

        // /////
        set.clear();
        System.out.println(set.size());

        for(int i = 0 ; i < arr1.length ; i++){
          set.add(arr1[i]);
        }

        int count = 0;
        for(int i = 0 ; i < arr2.length; i++){
                 if(set.contains(arr2[i])){
                     count++;
                     System.out.println(arr2[i]);
                      set.remove(arr2[i]);
                 }
          }

          System.out.println(count);
        }
     
}
