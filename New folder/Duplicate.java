public class Duplicate{

    public static int removeDupli(int arr[] , int n)
    {
        if(n == 1 || n == 0){
            return n;
        }

        int j = 0; 
        for(int i = 0 ;i  < n -1  ;i++){
            if(arr[i] != arr[i+1]){
               arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n-1];
        return j;
    }
    public static void main(String args[]){
        int arr[] ={1,1,2,4,4};
        int n = arr.length;
        int length =  removeDupli(arr,n);

        System.out.println(length);
        for(int i = 0; i < length; i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
}