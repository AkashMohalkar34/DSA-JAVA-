import java.util.Scanner;

public class Calculate_sum {

    public static int sum(int num1 , int num2)
    {
        int s = num1 + num2;
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
        int s = sum(a,b);
        System.out.println("The Sum is :" + s);
    }
}
