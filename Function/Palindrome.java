import java.util.Scanner;

public class Palindrome {
    public static void main(String args [])
    {
        System.out.println("Enter Number :");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();

        if(isPalindrome(palindrome))
        {2222
            System.out.println("Number : "+ palindrome + " is palindrome .");
        }
        else{
            System.out.println("Number : " + palindrome + " is Not a Palindrome.");
        }
    }

    public static boolean isPalindrome(int number)
     {
        int palindrome = number;
        int rev = 0;
        while(palindrome != 0)
        {
            int rem = palindrome % 10;
            rev = rev * 10 + rem;
            palindrome = palindrome / 10;

        }
        if(number == rev)
        {
            return true;
        }
        return false;
     }    
}
