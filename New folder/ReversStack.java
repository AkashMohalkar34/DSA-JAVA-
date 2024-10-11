import java.util.Stack;

public class ReversStack {

    public static void pushatB(Stack <Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return ;
        }
        int top = s.pop();
        pushatB(s, data);
        s.push(top);
    }

    public static void reversStack(Stack<Integer> s){
        if(s.isEmpty()){
            return ;
        }
        int top = s.pop();
        reversStack(s);
        pushatB(s,top);
    }
    public static void main(String args[]){
       Stack<Integer> s = new Stack<>();
       s.push(1);
       s.push(2);
       s.push(3);
       s.push(4);

       reversStack(s);

       while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
       }

    }
}
