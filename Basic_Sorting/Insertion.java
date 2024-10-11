public class Insertion
{
    public static void insertion_sort(int arr [])
    {

        for(int i = 1; i < arr.length;i++)
        {
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && temp < arr[j])
            {
                arr[j+1]= arr[j];
                j--;
            }
               arr[j+1] = temp;
        }
        System.out.println("Sorted Array :");
        for(int i = 0; i < arr.length; i++)
          {
            System.out.print(arr[i] +"  ");
          }  
    }
    public static void main(String args [])
    {
        int arr[] = {3,2,1,5,4};
        insertion_sort(arr);
    }
}