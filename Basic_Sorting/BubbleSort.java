public class BubbleSort {
    public static void bubbleS(int a[])
    {
        for(int i = 0; i < a.length - 1;i++)
        {
            for(int j = 0; j < a.length - 1 ;j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1]= temp;
                }
               
            }
        }

        System.out.println("Sorted Array is :");
        for(int i = 0; i < a.length;i++)
        {
            System.out.print(a[i] +" ");
        }
    }
    public static void main(String args [])
    {
        int arr []= {55,33,22,44};
        bubbleS(arr);

    }
}
