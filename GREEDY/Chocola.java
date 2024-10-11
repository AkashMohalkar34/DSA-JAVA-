import java.util.Arrays;
import java.util.Comparator;

public class Chocola {
    public static void main(String args[]){
        Integer costHor[] ={2,1,3,1,4};
        Integer costVar[] = {4,1,2};
        
        Arrays.sort(costVar,Comparator.reverseOrder());
        Arrays.sort(costHor,Comparator.reverseOrder());
        
        int v = 0 , h = 0;
        int hp =  1; 
        int vp = 1;
        int cost = 0;

        while(h < costHor.length && v < costVar.length){
            if(costHor[h] >= costVar[v]){
                cost += (costHor[h] * vp);
                h++;
                hp++;
            }else{
                cost += (costVar[v] * hp);
                v++;
                vp++;
            }
        }

        while(h < costHor.length){
            cost += (costHor[h] * vp);
            h++;
            hp++;
        }

        while(v < costVar.length){
            cost += (costVar[v] * hp);
            v++;
            vp++;
        }

        System.out.println("The cost of cuts "+ cost);
    }
}
