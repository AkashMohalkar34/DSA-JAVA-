public class CheckEoO {

public static boolean isEven(int n)
   {
         boolean isE = true;
         if(n % 2 == 0)
         {
            isE = true;
            return isE;
         }
         return false;
      }


    public static void main(String args [])
    {
     
      System.out.println(isEven(5));
    }
}
