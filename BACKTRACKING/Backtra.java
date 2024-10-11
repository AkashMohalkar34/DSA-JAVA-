public class Backtra
{
    public static void changeArray(int arr[],int i,int value)
    {
        // base
          if(i == arr.length)
          {
            printArray(arr);
            return;
          }

        // recursion
        arr[i] = value;

        changeArray(arr,i+1,value+1);
        arr[i] = arr[i] - 2;
        
    }
    public static void printArray(int arr[])

    {
        for(int i = 0; i<arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    //////////////////////////////////////
    public static void findsubString(String str,int i,String ans)
    {
        // base
        if(i == str.length())
        { 
            if(ans.length() == 0)
            {
                System.out.println("null");
        }else{
            System.out.println(ans);

        }
        return;
        }
        // yes
        findsubString(str,i+1,ans+str.charAt(i));
        // no
        findsubString(str,i+1,ans);
    }
    /// find permutation
    public static void findPermutation(String str,String ans)
    {
        if(str.length()== 0)
        {
            System.out.println(ans);
            return;
        }
        for(int i = 0; i< str.length();i++)
        {
            char curr = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            findPermutation(newStr, ans+curr);
        }
    }
    public static void main(String args [])
    {
      // int arr[] = new int[5];
       // changeArray(arr,0,1);
       // printArray(arr);

       String str = "abcd";
       // findsubString(str,0,"");
        findPermutation(str,"");


    }


}