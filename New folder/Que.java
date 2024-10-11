public class Que {

    static int arr[];
    static int size;
    static int rear;
    static int front;

    Que(int n){
        arr = new int[n];
        size = n;
        rear = -1;
        front = -1;
    }

    public static boolean isEmpty(){
        return rear == -1 && front == -1;
    }

    public static boolean isFull(){
        return (rear + 1 ) % size == front;
    }

    public static void add(int data){
        if(isFull()){
            System.out.println("Queue is Full");
            return ;
        }
        if(front == -1){
            front = 0;
        }

        rear = (rear + 1) % size;
        arr[rear] = data;


    }
 
    public static int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty ");
            return -1;
        }

        int result = arr[front];
        if(front == rear){
            rear = front = -1;
        }
        else{
            front = (front + 1) % size;
        }

        return result;


    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty .");
            return -1;
        }
        return arr[front];
    }
 
    public static void main(String args[]){
        Que q1 = new Que(5);
       q1.add(1);
       q1.add(2);
       q1.add(3);
       q1.add(4);
       q1.add(5);


       while(! q1.isEmpty()){
        System.out.print(q1.peek() + "  ");
        q1.remove();
       }
    }
}
