public class Bit
{

///////////////////////////////////////////////////////////////
// CHECK EVEN OR ODD
    public static void evenORodd(int n)
    {
        int Bitmask  = 1;
        if((n & 1)== 0)
        {
            System.out.println("number is Even..");
        }
        else{
            System.out.println("Number is Odd");
        }
    }

    ///////////////////////////////////////////////////
    // gET ITH BIT
    public static int getIthbit(int n, int i)
    {
        int bitMask = 1<<i ;
        if((n & bitMask) == 0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    
    }

    public static  int setIthbit(int n , int i)
    {
        int bitMask = 1<<i;
        
        
            return (n | bitMask);
        
    }


    public static int clearIthBit(int n,int i)
    {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i,int newBit)
    {
        n = clearIthBit(n,i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }
    public static void main(String args [])
    {
        /* 
          // AND OPERTOR
        System.out.println(5&6);
         // OR OPERATOR
         System.out.println(5 | 6) ;

         // X OR OPERATOR
         System.out.println(5 ^ 6);

         // one's complement
         System.out.println(~0);
         System.out.println(~5);
         // LEFT  SHIFT <<
          System.out.println(5<<2);

          // RIGHT SHIFT >>
          System.out.println(6>>1);
          System.out.println(6>>2);

        */
       
        //  evenORodd(3);
        //  evenORodd(14);
        //  evenORodd(9);

//         System.out.println(getIthbit(4,2));
     //    System.out.println(setIthbit(10,2));

       //  System.out.println(clearIthBit(10,2));
         System.out.println(updateIthBit(10,2,1));
        }
}