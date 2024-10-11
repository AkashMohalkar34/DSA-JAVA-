import java.util.ArrayList;

public class ActionSelection {
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end []  = {2,4,6,7,9,9};
        ArrayList <Integer> ans = new ArrayList<>();
        

        int maxA = 0;

        // first activity should selected
        maxA = 1;
        ans.add(0);

        int endLast = end[0];
        for(int i = 0;  i < end.length;i++){
            if(start[i] >= endLast){
                maxA ++;
                ans.add(i);
                endLast = end[i];
            }
        }
        System.out.println("Maximum Activity "+ maxA);
        for(int i = 0; i < ans.size(); i++){
            System.out.print("A" + ans.get(i) +"  ");
        }
        System.out.println();
    }
}
