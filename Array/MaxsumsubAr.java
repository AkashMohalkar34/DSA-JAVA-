public class MaxsumsubAr {

    public static void maxSum(int num[])
    {
        int maxS  = Integer.MIN_VALUE;
        int minS = Integer.MAX_VALUE;
        int Crsum = 0; 
        for(int i = 0; i < num.length;i++)
        {
            for(int j = i; j  < num.length;j++)
            {
                Crsum = 0;
                for(int k = i; k <= j;k++)
                {
                    // calculate subarray sum
                    Crsum = Crsum + num[k];
                }
                System.out.println(Crsum);
                if(maxS < Crsum)
                {
                    maxS = Crsum;
                }
          // for Minimum sum in the subArray.
                if(minS > Crsum)
                {
                    minS = Crsum;
                }
            }
        }

        System.out.println("The Max sum is :" + maxS);
        System.out.println("The Min sum is :" + minS);
    }
    public static void main(String args [])
    {
        int numbers [] = {2,4,6,8,10};
        maxSum(numbers);
    }
}
