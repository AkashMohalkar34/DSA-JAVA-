public class InsertionS {

    public static void insertionSort(int arr[]){
         for(int j = 1; j < arr.length ;j++){
                int temp = arr[j];
                 
                 int  i = j - 1;

                 while ((i > -1) && (arr[i] > temp)) {
                    arr[i+1] = arr[i];
                    i--;
                 }
                 arr[i+1] = temp;
         } 

         for(int i = 0 ;i < arr.length;i++){
            System.out.print(arr[i]+"  ");
         }
    }
    public static void main(String args[]){
        int arr[] ={55,44,33,22,11};
        insertionSort(arr);
    }
    
}
