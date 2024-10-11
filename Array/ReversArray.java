public class ReversArray {
    
    public static void revArray(int num[])
    {
        int f = 0; 
        int e = num.length - 1;
        while(f < e)
        {
            int temp = num[e];
            num[e] = num[f];
            num[f] = temp;
            f++;
            e--;
        }
    }
    public static void main(String args [])
    {
        int num []={2,4,6,8,10};
        revArray(num);
          System.out.println("Revers Array is :");
          for(int i = 0; i <= num.length;i++)
          {
            System.out.print(num[i] +" ");
          }
          System.out.println();
    }
}
