import java.util.Scanner;

public class Avg {

        public static int avg(int a, int b, int c)
        {
            return (a+b+c)/3;
        }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A , B and C ");
        int a  = sc.nextInt();
        int b  = sc.nextInt();
        int c  = sc.nextInt();
       
        
        System.out.println("The Average is :" + avg(a,b,c));
    }
}
