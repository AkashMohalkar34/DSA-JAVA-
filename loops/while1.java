package loops;
import java.util.*;
public class while1 {
    public static void main(String argv[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N :");
        int n = sc.nextInt();
        int counter = 1;
        int sum = 0;
        while(counter < n)
        {
            System.out.println(counter);
            sum = sum + counter;
            counter++;
        }
        System.out.println("The Sum is :" + sum);
    }
}
