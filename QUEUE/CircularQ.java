public class CircularQ {
    static int arr[];
    static int size;
    static int rear;
    static int front;

    public CircularQ(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
        front = -1;
    }
    // isEmpty
    public static boolean isEmpty(){
        return rear == -1 && front == -1;
    }

    // isfull
    public static boolean isfull(){
        return (rear + 1 )%size == front;
    }

    // add
    public static void add(int data){
        if(isfull()){
            System.out.println("Queue is full ");
            return ;
        }
        // element is first
        if(front == -1)
        {

            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
    }

   public static int remove(){
     if(isEmpty()){
        System.out.println("Queue is empty .");
        return -1 ;
     }
     int result = arr[front];

     // last
     if(rear == front){
        rear = front = -1;
     }
     else{
     front = (front + 1 ) % size;

     }
     return result;
   }

   public static int peek(){
    if(isEmpty()){
        System.out.println("Queue is empty.");
        return -1;
    }
    else{
        return arr[front];
    }
   }
    
    public static void main(String[] args) {

        CircularQ q = new CircularQ(5);
        add(1);
        add(2);
        add(3);
          
        remove();
        add(1);
        while(!isEmpty()){
           System.out.println(peek());
           remove();
    }
  }
}
