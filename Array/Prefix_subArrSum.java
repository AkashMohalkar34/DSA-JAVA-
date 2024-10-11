public class Prefix_subArrSum {

   public static void maxSubArraySum(int num[])
   {
    int i;
    int maxS = Integer.MIN_VALUE;
    int currSum = 0;
    int prefix[] = new int[num.length];

    prefix[0] = num[0];
    // Calculate prefix array
    for(i = 1; i < prefix.length;i++);
    {
        prefix[i] = prefix[i - 1] + num[i];
    }



    for(i = 0; i < num.length;i++)
    {
        int start = i;
        for(int j = i; j < num.length ; j++)
        {
           
            int end = j;
          currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

          if(maxS < currSum)
          {
            maxS = currSum;
          }
        }
    }
    System.out.println("The Max Sum is :" + maxS);
   }

   public static void kadane(int num[])
   {
    int ms = Integer.MIN_VALUE;
    int cs = 0;
    for(int i = 0; i < num.length;i++)
    {
        cs = cs + num[i];
        if(cs < 0)
        {
            cs = 0;
        }
        ms = Math.max(cs,ms);
    }
    System.out.println("The Max Sum is :" + ms);

   }
    public static void main(String args [])
    {
        int num [] = {2,4,6,8,10};
        kadane(num);
    }
}
