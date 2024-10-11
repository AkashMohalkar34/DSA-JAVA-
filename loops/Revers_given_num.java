public class Revers_given_num {
    
    public static void main(String[] args) {
        int rev = 0;
        int number = 12345;
        int lastDigit;
        while(number > 0)
        {
            lastDigit = number % 10;
            rev = (rev * 10) + lastDigit;
            number = number / 10;
            
        }
        System.out.println(rev);
    }
}
