public class BubbleS {

    public static void BubbleSort(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
             for(int j = 0; j < arr.length -1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp  ;
                }
             }
        }

        for(int i = 0 ;i < arr.length; i++){
            System.out.print(arr[i] +"  ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {55,44,333,22,11};
        BubbleSort(arr);
    }
}
