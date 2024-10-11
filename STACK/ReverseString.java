
import java.util.*;;

public class ReverseString {
    
    public static String RevString(String str){
         Stack<Character> s = new Stack<>();
         int idx = 0;

         while(idx < str.length()){
            s.push(str.charAt(idx));
         }

         StringBuilder result = new StringBuilder();

         while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
         }

         return result.toString();
    }
 
 
 
    public static void main(String args []){
        String str = "sai";
        String result = RevString(str);

        System.out.println("jeij");
        System.out.println(result);
    }
}
