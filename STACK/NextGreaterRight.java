import java.util.Stack;

public class NextGreaterRight {
    public static void main(String args [])
     { 
         int arr [] = {6,8,0,1,3};
         Stack <Integer> s = new Stack<>();
         int nextGreater [] = new int[arr.length];
         for(int i = 0 ; i <= arr.length - 1; i++){
            // while
             
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            // if -- else
               if(s.isEmpty()){
                nextGreater[i] = -1;
               }
               else{
                nextGreater [i] = arr[s.peek()];
               }
            // push at stack
            s.push(i);
         }

         // for
         for(int i = 0 ; i < nextGreater.length ; i++){
            System.out.print(nextGreater[i] + "  ");

         }
         System.out.println();
          
         ///  NEXT GREATER RIGHT;
         // NEXT GREATER LEFT  // for(int  i = 0; i < arr.lenght -1 ;i++);
         /* NEXT SMALLER RIGHT 
         for(int i = 0 ; i <= arr.length - 1; i++){
              arr[s.peek()] >= arr[i]; }*/
         /* 
          *  NEXT SMALLET LEFT
         for(int  i = 0; i < arr.lenght -1 ;i++){
            arr[s.peek()] >= arr[i]; }*/
         

         }

     }    
}
