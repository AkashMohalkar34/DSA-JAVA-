public class Binomial {

    public static int fact(int n)
    {
        int f = 1; 
        for(int i = 1; i <= n; i++)
        {
            f = f * i;
        }
        return f;
    }

    public static int binomial(int n, int r)
     {
         int n_fact = fact(n);
         int r_fact = fact(r);
         int nmr_fact = fact(n - r);

        return n_fact/(r_fact * nmr_fact);
  
     }
    public static void main(String args[])
    {
        // int n = 10; 
        // int r  = 5;
        int b1 = binomial(5,2);

        System.out.println(b1);
        System.out.println(fact(3));

    }
}
