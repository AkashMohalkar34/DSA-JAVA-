import java.util.*;
public class Prime_number {
    public static void main(String args [])
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a Number to Check Number is Prime or not ");
         int n = sc.nextInt();
         boolean isPrime = true;

         if(n == 2)
         {
            System.out.println("N is prime");
         }
         for(int i = 2; i <= n - 1 ;i ++)  // for(int i = 2; i < Math.sert(n);i++)
         {
            if(n % i == 0)
            {
                isPrime = false;
            }
         }
         if(isPrime ==true)
         {
            System.out.println("n is prime ");
         }else{
            System.out.println("n is not prime");
         }

    }
    
}
