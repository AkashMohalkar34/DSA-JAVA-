
public class DtoB {

    public static void dectobin(int n)
{
    int MyNum = n;
    int pow =  0; 
    int binNum = 0;
    while(n > 0)
    {
       int  lastDigit = n % 2;
       binNum = binNum + lastDigit * (int)Math.pow(10, pow);
       pow++;
       n = n / 2;
    }
    System.out.println("The Decimal " + MyNum + "  ="+ binNum);
}
    public static void main(String args [])
    {
       dectobin(7);
    }
}
