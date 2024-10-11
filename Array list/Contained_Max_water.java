// calculate maximum water store in the container 
import java.util.*;

public class Contained_Max_water {

    public static int storeWater(ArrayList<Integer>height)
    {
        int maxWater = 0;
        // Brute Force

        for(int i = 0; i<height.size();i++){
            for(int j = i+1; j<height.size();j++){
                int ht  = Math.min(height.get(i) ,height.get(j));
                int width = j - i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater,currWater);

            }
        }
        return maxWater;
    }

    // to reduce the time complexity of the using two pinter methode
    // in which create left pointer and right pointer 
    public static int storeWater1(ArrayList<Integer>height){
        int maxWater =0;
        int lp = 0; int rp = height.size() - 1;
        while(lp < rp){
            int ht = Math.min(height.get(lp) , height.get(rp));
            int width = rp - lp;
            int currWater = width * ht;
             maxWater = Math.max(currWater, maxWater);
           
             if(lp < rp){
                lp++;
             }
             else{
                rp--;
             }
            
        }
        return maxWater;
    }
    public static void main(String args []){

        ArrayList<Integer>height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
      

        System.out.println(storeWater(height));
        System.out.println(storeWater1(height));

    


}  
}
