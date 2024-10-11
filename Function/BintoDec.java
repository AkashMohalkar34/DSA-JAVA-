public class BintoDec {

    public static void BtoD(int binNum)
    {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while(binNum > 0)
        {
            int lastDigit ;
            lastDigit = binNum % 10;
            decNum = decNum +lastDigit * (int)Math.pow(2,pow);
            pow++;
            binNum = binNum / 10; 
        }
        System.out.println("The Binary " + myNum + " =" + decNum );

    }
    public static void main(String args [])
    {
            BtoD(1111);
    }
}
