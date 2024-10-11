public class fact {
    public static int f(int n)
    {
        int factorial = 1; 
        for(int i = 1; i <= n; i++)
        {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String args [])
    {
        System.out.println(f(5));
    }
}
