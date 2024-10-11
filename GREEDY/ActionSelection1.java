import java.util.ArrayList;

public class ActionSelection1 {
    public static void main(String args[]){
        int start[] = {2,5,1,5,3,7,8};
        int end[] = {3,2,6,4,2,7,2};

        int activities[][] = new int[start.length][3];
        for(int i = 0; i < start.length ; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        ArrayList <Integer> ans = new ArrayList<>();
        int maxA = 0;

        // 1st selected
        maxA = 1;
        ans.add(activities[0][0]);

        int lastEnd = activities[0][2];

        for(int i = 0 ; i < end.length ; i++){
            if(activities[i][1] >= lastEnd){
                maxA++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Maximum Activity "+ maxA);
        for(int i = 0; i < ans.size(); i++){
            System.out.print("A" + ans.get(i) +"  ");
        }
        System.out.println();
    }
}
