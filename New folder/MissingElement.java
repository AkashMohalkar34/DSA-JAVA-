public class MissingElement {
    
    public static int missingEle(int arr[], int n){
        // calculte the of the array
        int sum1 = 0;
        for(int i = 0; i < n ; i++){
            sum1 = sum1 + arr[i];
        }
        System.out.println(sum1);

        int sum2 = 0;
        for(int i = 1 ; i <= 5 ; i++){
            sum2 =  sum2 + i;
        }

        System.out.println(sum2);
        return sum2 - sum1;
    }
    public static void main(String args[]){
        int arr[] = {1,2,4,5};
        int n = arr.length;

        int missing =  missingEle(arr,n);
        System.out.println(missing);
    }
}
