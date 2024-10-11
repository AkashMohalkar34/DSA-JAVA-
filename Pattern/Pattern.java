public class Pattern {
    public static void Inverted_RotateHalfp()
    {
        int n = 5;
        for(int i = 1; i <= n;i++)
        {
            for(int j = 1; j <=  n - i; j++)
            { // space printing loop.
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++)
            {
                // star printing loop.
                System.out.print("*");

            }
            System.out.println();  
        }
    }
    ////////////////////////////////////////////////

    public static void invertedHalfP()
    {
        int n = 5;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1 ; j <= n - i + 1; j++)
            {
                System.out.print(j);
            }
            for(int j = 0; j<= i;j++)
            {
                System.out.print("");
            }
            System.out.println();
        }
    }
    ////////////////////////////////////////////////

    // FLODY'S TRIANGLE
    public static void flodyTriangle()
    {
        int count = 0;
        int n = 5;
        for(int i = 1; i<= n;i++)
        {
            
            for(int j = 1 ; j <= i; j++)
            {    count++;
                 System.out.print(count +"  ");
            }
       //     System.out.println();
           }
       /////////////////////////////////////////////// 
    public static void zero_one_triangle()
    {
        
        int n = 5;
        for(int i = 1; i<= n;i++)
        {
            
            for(int j = 1 ; j <= i; j++)
            {   
                if((i + j) % 2 == 0)
                {
                    System.out.print("1" +" ");
                }
                else
                {
                    System.out.print("0"+" " );

                }
            }
            System.out.println();

       }
    
  }
  /////////////////////////////////////////
  public static void Solid_rhombus()
  {
    int n = 5;
    for(int i = 0; i <= n; i++)
    {
        for(int j = 1 ; j <= n - i; j++)
        {
            System.out.print(" ");
        }
        for(int j = 1; j <= n;j++)
        {
            System.out.print("*");
        }
        System.out.println
    }
  }
    public static void main(String args [])
    {
       // Inverted_RotateHalfp();
       //invertedHalfP();
        //  flodyTriangle();
          zero_one_triangle();
    }
}
