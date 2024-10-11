import java.util.Scanner;

public class Strings{

    public static void printLetter(String str)
    {
        for(int i = 0; i < str.length();i++)
        {
            System.out.print(str.charAt(i) +" ");
        }
        System.out.println();
    }

    public static boolean isPalindrome(String str)
    {
        
        for(int i = 0; i < str.length();i++)
        {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n - i -1))
            {
                return false;
            }

        }
        return true;
    }
    public static void main(String args[])
    {
        char arr[] = {'a','s','d','f'};
        String str = "akash";
        String str1 = new String("akash");

        // STRING ARE IMMUTABLE...

        // GET INPUT FROM USER.
        Scanner sc = new Scanner(System.in);

        String name;
      //  name = sc.next();                  // get single word eg. hello  world // op is hello 
                                             // not consider space.
         
    //     name = sc.nextLine(); // get full line ..
    //     System.out.println(name);
    //  print length of the string 
    //     System.out.println(name.length()); 

         /*
         *  // String Concatation

        String firstName = "Sagar";
        String lastName  = " Mokalkar";
        String fullName = firstName + " " + lastName;
       //  System.out.println(fullName);

        // print letters in the string...
        printLetter(fullName);
        System.out.println(fullName.charAt(9));
       */

       String str3 = "nooddn";
       System.out.println(isPalindrome(str3));
    
    }

   
}