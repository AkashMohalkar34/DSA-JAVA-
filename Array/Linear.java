public class Linear {

    public static int linearSearch(int num[] , int key)
    {
        for(int i = 0; i <= num.length;i++)
        {
            if(num[i]== key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args [])
    {
        int numbers [] = {23,13,4,5,7,3,7,54,75,75,32};
        int key =131;
        int search = linearSearch(numbers,key);
        if(search == -1)
        {
            System.out.println("Not Found.");
        }
        else{
            System.out.println("Element found at Index :" + search);
        }
    }
}
