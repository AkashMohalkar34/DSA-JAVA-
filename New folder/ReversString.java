import java.util.*;
public class ReversString {

    public static String revString(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0 ; i < str.length();i++){
            char ch = str.charAt(i);
            s.push(ch);

        }

        StringBuilder res = new StringBuilder(" ");
        while(!s.isEmpty()){
                  res.append(s.pop());
                  
        }
        return res.toString();
    }
    public static void main(String args[]){
        String str = "Akash";
        String res = revString(str);
        System.out.println(res);
    }
}
