public class call_by_value {
    
    public static void swap(int a, int b)
{
    int temp = a; 
     a = b;
      b = temp;
}    public static void main(String args [])
    {
        int a = 5;
        int b = 10;
        swap(a,b);

        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }
}
