public class Rhoumbus {
    public static void SolidR(int n)
    {
        for(int i = 0; i <= n; i++)
        {
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1 ; j <= n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowR(int n)
    {
        for(int i = 1; i<= n; i++)
        {
            for(int j = 1; j <= n - i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=n ;j++)
            {
                if(i == 1|| i == n ||j == 1||j == n)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /////////////////////////////////////////////
    // DIAMOND PATTERN
    public static void diamondP(int n)
    {
        for(int i = 1; i<= n; i++)
        {
            for(int j = 1; j <= n - i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j <= (2 * i) - 1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // second half
         System.out.println();
          for(int  i = n; i>= 1;i--)
        {
            for(int j = 1; j <= n - i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j <= (2 * i) - 1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
          
    }

    //////////////////////////////////////////////
    //     NUMBER PYRAMID
    public static void numberPyramid(int n)
    { // outer loop
        for(int i = 1; i<= n;i++)
        {
            // spaces printing
            for(int j = 1; j<= n - i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<= i;j++)
            {
                // numbers printing
                System.out.print(i +" ");
            }
            System.out.println();
        }
    

}
    public static void main(String args [])
    {
        int n = 5; 
      //  SolidR(n);
       //  hollowR(5);
       // diamondP(5);
       numberPyramid(5);
    }
}
