import java.util.*;

public class addition {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice ;
        int number  ;
        int evenSum = 0;
        int oddSum = 0;
        do{
            System.out.println("Enter Number :");
                number =  sc.nextInt();
            if(number % 2 == 0)
            {
                evenSum +=  number;
            } 
            else
            {
                oddSum += number;
            }

            System.out.println("Enter a 1 if your continue , if not then press 0:");
            choice = sc.nextInt();
        }while(choice == 1);

        System.out.println("sum of the Even Number :" + evenSum);
        System.out.println("sum of the Odd Number : " + oddSum);

    }
    

}
