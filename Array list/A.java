import java.util.ArrayList;
import java.util.Collections;
public class A{

    // Swaping tow numbers in the Array list
    public static void swapNum(ArrayList<Integer>list , int Idx1 , int Idx2){
        int temp = list.get(Idx1);
        list.set(Idx1, list.get(Idx2));
        list.set(Idx2  , temp);
       }
    public static void main(String args [])
    {
        ArrayList <Integer> list = new ArrayList<>();
        // add operation in the Array
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(4); 
        list.add(9);
        list.add(0);
        list.add(7);
        list.add(8);
      //  System.out.println(list);

        // get element in the Array
     //   int element =  list.get(2);
       // System.out.println(element);

        // remove element in the Array
    ////    list.remove(2);
       // System.out.println(list);

       // Set element in the index

       list.set(2, 10);
     //  System.out.println(list);

       // element are contain in the array or not
    //   System.out.println(list.contains(1));
    //   System.out.println(list.contains(11));

       // print Array element in the Array
       for(int i = 0; i< list.size();i++)
       {
     //   System.out.print(list.get(i) + "  ");
       }
    //   System.out.println();
       // print element in the array in revers order 
       for(int i = list.size() - 1;i>= 0;i--)
       {
   //     System.out.print(list.get(i) + "  ");
       }

       // print max element in the Array
       int max = Integer.MIN_VALUE;
       for(int i = 0; i< list.size();i++){
        if(max < list.get(i)){
            max = list.get(i);
        }
       }
       System.out.println(max);

       
       int Idx1 = 1;
       int Idx2 = 3;
    //   System.out.println(list);
   //    swapNum(list, Idx1 , Idx2);
   //    System.out.println(list);
      

      // sorting element in the array
       // ascending order
       System.out.println(list);
      Collections.sort(list);
      System.out.println(list);
         

       // descending order
       Collections.sort(list , Collections.reverseOrder());
       System.out.println(list);
    }
}
