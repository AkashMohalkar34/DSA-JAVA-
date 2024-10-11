import java.util.Scanner;

public class factorial {
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n = sc.nextInt();
        int i;
        int fact = 1 ;
        for(i = n ; i > 0;i--)
        {
            fact = fact * i;

        }
        System.out.println("The Factorial of the " + n + " is :"  + fact);
    }
}
