import java.util.PriorityQueue;

public class NearestKcar {
   public static class Point implements Comparable <Point> {
    int x;
    int y;
    int sqDist ;
    int idx;
    public Point(int x , int y , int sqDist , int idx){
        this.x = x;
        this.y = y;
        this.sqDist = sqDist;
        this.idx = idx;
    }

    public int compareTo(Point s2){
        return this.sqDist - s2.sqDist;
    }
   }
   
   public static void main(String args[]){
      int pts[][] = {{3,3},{5,-1} , {-2 , 4}};
        int k = 2;
      PriorityQueue<Point> pq = new PriorityQueue<>();
      for(int i  = 0; i < pts.length ; i++){
        int dist = pts[i][0] * pts[i][0]+pts[i][1] * pts[i][1];

        pq.add(new Point(pts[i][0], pts[i][1], dist, i));
      }

      for(int i = 0 ; i < k ; i++){
        System.out.println("C"+pq.remove().idx);
      }

   }
}
