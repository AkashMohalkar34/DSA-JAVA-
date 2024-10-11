public class SelectionSort {

    public static void selectionSort(int arr[]){
        for(int i = 0 ; i < arr.length;i++){
            int min = arr[i];
            int index = i;
            for(int j = i + 1; j < arr.length ;j++){
                 if(min > arr[j]){
                    min = arr[j];
                    index = j;
                 }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
        }


        for(int i = 0;i < arr.length ; i++){
            System.out.print(arr[i] +"  ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {55,44,33,22,11};
        selectionSort(arr);

    }
}
