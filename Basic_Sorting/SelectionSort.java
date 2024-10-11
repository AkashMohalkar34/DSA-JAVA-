public class SelectionSort {

    public static void selectionS(int a[])
    {
        for(int i = 0 ; i < a.length - 1;i++)
        {
            int min = a[i];
            int index = i;
            for(int j = i + 1;j <= a.length - 1 ;j++)
            {
                if(min > a[j])
                {
                    min = a[j];
                    index = j;
                }
                
            }
                int temp = a[i];
                a[i] = min;
                a[index] = temp;

        }
        System.out.println("Sorted Array :");
        for(int i = 0; i < a.length;i++)
        {
            System.out.print(a[i] + "  ");
        }
    }
    public static void main(String args [])
    { 
        int arr [] = {55,33,22,44,11};
        selectionS(arr);

    }
}
