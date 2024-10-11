import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {

    public class Job{
        int profit;
        int deadline ;
        int id;
        public Job(int i , int d, int p){
            deadline = d;
            profit = p;
            id  = i;
        }
    }
    public static void main(String args[]){
        int jobInfo[][] = {{4,20},{1,20},{1,40},{1,30}};

        ArrayList <Job> jobs = new ArrayList<>();
        for(int i = 0; i < jobInfo.length ; i++){
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        // sorting profit in descending order
        Collections.sort(jobs,(obj1 , obj2) -> obj2.profit-obj1.profit );
        
        int time = 0;
        ArrayList < Integer> seq = new ArrayList<>();
        for(int i = 0 ; i < jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                  seq.add(curr.id);
                  time++;
            }
        }

        System.out.println("max job " + seq.size());
        for(int i = 0 ; i < seq.size();i++){
            System.out.print(seq.get(i)+"  ");
        }
        System.out.println();



    }
}
