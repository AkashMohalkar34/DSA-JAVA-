import java.util.*;
public class Queue2S {
    public static class stack{
       static Queue<Integer> q1 = new ArrayDeque<>();
       static Queue<Integer> q2 = new ArrayDeque<>();


        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void add(int data){
           if(!q1.isEmpty()){
                q1.add(data);
            }
            else{
                q2.add(data);
            }
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty stack");
            }

            int top = -1;
            if(!q1.isEmpty()){
               while (! q1.isEmpty()) {
                    top = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
               }
            }
            else{
                while(! q2.isEmpty()){
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }

            return top;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty stack");
                return -1;
            }

            int top = -1;
            if(! q1.isEmpty()){
                while(! q1.isEmpty()){
                    top = q1.remove();
                    q2.add(top); 
                }
            }
            else{
                while(! q2.isEmpty()){
                     top = q2.remove();
                     q1.add(top);
                }
            }

            return top;
        }
    }
    public static void main(String args[]){
         stack s = new stack();
         s.add(1);
         s.add(2);
         s.add(3);
         s.add(4);

         while(! s.isEmpty()){
            System.out.print(s.peek() + "  ");
            s.remove();
         }
    }
}
