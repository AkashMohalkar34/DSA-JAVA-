import java.util.HashSet;

public class CountDistinctElement {
    public static void main(String args[]){
    int arr[] ={ 2,4,1,4,2,4,5,2,56,7,5,7};

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < arr.length; i++){
            set.add(arr[i]);
        }

        System.out.println(set.size());
    }
}
