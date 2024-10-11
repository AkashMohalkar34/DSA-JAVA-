import java.util.Stack;

public class Palindrome {

    public static boolean isPalindrome(String str){
        String a = str;
         Stack <Character> s = new Stack();  
     
         for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            s.push(ch);
          }
           StringBuilder result  =  new StringBuilder();
           while(!s.isEmpty())
               {
                char curr = s.peek();
                s.pop();
                result.append(curr);
               }
               String str1 = result.toString();
             
               for(int j = 0; j< str.length();j++)
               {
                   if(a.charAt(j) != str1.charAt(j)){
                         return false;
                   }
                   else{
                    return true;
                   }
               }
               return true;
        }


    public static void main(String args []){
        String str = "nanaa";
        System.out.println(isPalindrome(str));
    }
}
