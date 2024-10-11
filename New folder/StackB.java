public class StackB{

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node  head = null;
    public static class Stack {
    
        public static boolean isEmpty(){
            return head == null;
        }
    

    public static void push(int data){
        Node  newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
       
    }

    public static int pop(){
        if(isEmpty()){
            System.out.println("is Empty");
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public static int peek(){
        return head.data;
    }

}
    public static void main(String args[]){
       Stack s = new Stack();
       s.push(1);
       s.push(2);
       s.push(3);
       s.push(4);
       s.push(5);

       while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
       }
    }
}


// import java.util.ArrayList;

// public class StackB {

//    static ArrayList<Integer> list = new ArrayList<>();

//     public static class Stack{
//          public static boolean isEmpty(){
//             return list.size() == 0;
//          }

//          public static void push(int data){
//             list.add(data);
//          }

//          public static int pop(){
//             int top = list.get(list.size() - 1);
//             list.remove(list.size() - 1);
//             return top;
//          }

//          public static int peek(){
//             return list.get(list.size() - 1);
//          }
//     }
//     public static void main(String args[]){
     
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         s.push(5);

//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }

//     }
// }
