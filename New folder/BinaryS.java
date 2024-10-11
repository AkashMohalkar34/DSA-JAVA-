public class BinaryS {

    public static void binarySearch(int arr[] , int n , int key){
        int l = 0;
        int r = n - 1;

        int mid = 0;
        while(l < r){
            mid = r+l/2;

            if(arr[mid] == key ){
                System.out.println(mid);
                break;
            }
            else if (arr[mid] > key) {
                 l--;
            } else {
                r++;
            }
        }
    }
    public static void main(String args[]){
        int arr[] ={1,2,3,4,5,6,7};
        int n = arr.length;
        int key = 4;
        binarySearch(arr,n,key);
    }
}
