public class Arrayreverse {

    public static void reveresArray(int arr[] , int n){
         for(int i = 0 ; i < n;i++, n--){
             int temp = arr[i];
             arr[i] = arr[n-1];
             arr[n-1] = temp;

         }

         for(int i = 0 ; i < arr.length;i++){
            System.out.print(arr[i] +"  ");
         }
         System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        reveresArray(arr,n);

    }
}
