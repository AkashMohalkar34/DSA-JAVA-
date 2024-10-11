public class Printnum{
    public static void printDec(int n)
    {
        if(n == 1)
        {
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        printDec(n - 1);
    }

    public static void printInc(int n)
    {
        if (n == 1)
        {
            System.out.println(1);
          return ;
        }
        printInc(n - 1);
        System.out.println(n);
    }

    public static int factnum(int n)
    {
        if(n == 0)
        {
            return 1;
             
        }
       int fact = n * factnum(n - 1);
     //  System.out.println(fact);
       return fact;
    }
    public static int printSum(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        int snm1 = printSum(n - 1);
        int sn = n + snm1;

        return sn;
    }

    public static int fibNum(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }
        int nm1 = fibNum(n - 1);
        int nm2 = fibNum(n - 2);
        int fn = nm1 + nm2 ;
        return fn;
    }

    public static boolean isSorted(int arr[], int i)
    {
        if(i == arr.length - 1)
        {
            return true;
        }
        if(arr[i] > arr[i+1])
        {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    /* WEF TO CALCULATE FIRST OCCURANCE OF THE ELEMENT IN THE ARRAY  */
    public static int isSearched(int arr[] , int key, int i)
    {
        if(i == arr.length - 1)
        {
            return -1;
        }
       
        if(arr[i] == key)
        {
            return i;
        }
     
        return isSearched(arr, key, i+1);
    }
    /* WEF TO CALCULATE LAST OCCURANCE OF THE ELEMENT IN THE ARRAY  */
      public static int lastOcurrance(int arr[], int key , int i)
      {
        if(i == arr.length)
        {
            return -1;
        }
        int isfound = lastOcurrance(arr, key, i+1);
        if(isfound  == -1 && arr[i] == key);
        {
            return i;
        }
        
      //   return isfound;
      }
      public static int power(int x , int n)
      {
        if(n == 0)
        {
            return 1;
        }
        int Xnm1 = power(x,n - 1);
        int xn = x * Xnm1;
        return xn;
      }

   //  TILING PROBLEM ////
public static int tilingProblem(int n)

{
    if(n == 0 || n == 1)
     {
        return 1;
     }

    // 2 * n(size of the floor)

    // vertical choice 
    int fnm1 = tilingProblem(n - 1);
    // horizontal choice 
    int fnm2 = tilingProblem(n - 2);
    // total ways
    int totalWays = fnm1 + fnm2;
    return totalWays;
}

    // DUPLICATE IN THE STRING 
    public static void duplicateString(String str , int idx , StringBuilder newStr, boolean map [])
    {
        if(idx == str.length())
        {
            System.out.println(newStr);
            return ;
        }
        // work
        char currChar = str.charAt(idx);
        if(map[currChar - 'a' ] == true)
        {
            // duplicate
            duplicateString(str, idx  + 1, newStr, map);
        }
        else
        {
            map[currChar - 'a' ]= true;
            duplicateString(str, idx + 1, newStr.append(currChar), map);
        }
    }

    //Friends pairing 
    public static int friendPair(int n)
    {
        if(n == 1 || n == 2)
        {
            return n;
        }
        // single
        int fnm1 = friendPair(n - 1);

        // pair
        int fnm2 = friendPair(n - 2);
        int pairWay = fnm1 * fnm2;

        int totalWays = fnm1 + pairWay;
        return totalWays;
    }

    // print Binary Tree
    public static void printBanaryString(int n ,int lastPlace , String str){
        // base case
        if(n == 0)
        {
            System.out.println(str);
            return ;
        }
        // kaam 
        if(lastPlace == 0)
        {
            printBanaryString(n - 1, 0, str+"0");
            printBanaryString(n - 1, 1, str+"1");
        }
        else{
            printBanaryString(n - 1, 0, str+"0");
        }
    }

    public static void main(String args [])
    {
      //  int n = 5;
       //  printDec(n);
        // printInc(n);    

         //  System.out.println(factnum(7));
         // System.out.println(printSum(n));
        //  System.out.println(fibNum(5));
        //  System.out.println(fibNum(6));
        //  System.out.println(fibNum(7));
        //  System.out.println(fibNum(8));
         // int a[] = {1,4,3,4};
        //  System.out.println(isSorted(a, 0));
            // int arr[] = {2,5,6,4,3,7,4,2};
        //    System.out.println(isSearched(arr, 20, 0));
           // System.out.println(lastOcurrance(arr,3,0));
           //System.out.println(power(2,10));
    //   System.out.println(tilingProblem(4));
     //  boolean map = new boolean[26];
 
   //    String str = "appannacollege";
     //  duplicateString(str, 0,new StringBuilder(" "),new boolean[26]);
      //   System.out.println(friendPair(3));
      printBanaryString(3, 0," ");
    }
} 