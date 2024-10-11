import java.util.Stack;

public class pushatB {

    public static void AddtoBottom(Stack<Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return ;
        }
        int top = s.pop();
        AddtoBottom(s,data);
        s.push(top);
    }
    public static void main(String args[]){
        Stack s  = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        AddtoBottom(s,4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
