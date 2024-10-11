import java.util.ArrayList;
 
public class TargetSum {
  public static boolean pairSum(ArrayList<Integer>height , int terget)

{  
    for(int i = 0; i< height.size();i++){
        for(int j = i +1 ; j< height.size() ;j++){
            if(height.get(i) + height.get(j)==terget){
                return true;
            }
        }
    }
    return false;



}
public static boolean pairSum2(ArrayList<Integer>height , int target)
{
    int lp = 0;
    int rp = height.size() -1 ;
    while(lp != rp){
        // case 1\
        if(height.get(lp) + height.get(rp) == target){
            return true;
        }
        // case 2
        if(height.get(lp) + height.get(rp) < target){
            lp ++;
        }
        else{
            rp --;
        }

    }
    return false;
}
public static void main(String args [])
  {
    ArrayList<Integer>height = new ArrayList<>();
    height.add(5);
    height.add(2);
    height.add(1);
    height.add(5);
    int target = 10;
      
    System.out.println(pairSum2(height, target));
  }
}
