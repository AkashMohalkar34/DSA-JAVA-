
public class LargNum {

public static void largnumber(int num [])
{
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for(int i = 0; i < num.length;i++)
    {
        if(max < num[i])
        {
            max = num[i];
        }
        if(min > num[i])
        {
            min = num[i];
        }
        
    }
    System.out.println("Smallest Value is =" + min);
    System.out.println("Largest Value is =" + max);
    
}


    public static void main(String args [])
    {
        int array[] = {23,42,53,53,342,43,1,45,4,67,86,87};
        largnumber(array);
    }
}
