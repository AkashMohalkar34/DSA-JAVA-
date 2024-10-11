public class ModifiedBubble{

    public static void bubbleSort(int array[])
    {
        int n = array.length;

        for(int i = 0; i< n; i++)
        {
            boolean bubble = false;
            for(int j = 0; j< n - 1 - i; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                    bubble = true;
                }
            }
            if(bubble == false)
            {
                System.out.println("Array is Alredy sorted .");
                break;
            }
        }

        System.out.println("Sorted Array is " );
        for(int  i = 0; i< n; i++)
        {
            System.out.print(array[i] + "  ");
        }
    }
    public static void main(String args [])
    {
        int array1[] = {1,21,3,4,5};
        bubbleSort(array1);
    }
}