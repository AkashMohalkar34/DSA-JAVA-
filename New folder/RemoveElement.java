public class RemoveElement{
    public static int remove(int arr[] , int n , int val){
        

        int count = 0;
        for(int i = 0; i < arr.length ;i++){
            if(arr[i] != val){
                 arr[count++] = arr[i];
            }
        }
        return count;

    }
    public static void main(String args[]){
        int arr[] ={3,2,3,2,3,5};
        int n = arr.length;
        int val = 3;
         int k =  remove(arr,n , val);
        System.out.println(k);

        for(int i = 0;i < k ;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}