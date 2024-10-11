import java.util.*;
public class TopologicalS {
    public static class Edge{
        int s;
        int d;
        int w;
        public Edge(int s, int d){
            this.d = d;
            this.s = s;
            this.w = w;
        }
    }

    public static void creatGraph(ArrayList<Edge> [] graph){

        for(int i = 0 ; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));
        
        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4 ,1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));


    }

    public static void calculatIn(ArrayList<Edge> [] graph, int indg[]){
          for(int i = 0 ; i < graph.length; i++){
            int v = i; 
            for(int j = 0; j < graph[v].size(); j++){
                Edge e = graph[v].get(j);
                indg[e.d]++;
            }
          }
    }
   public static void topSorting(ArrayList<Edge> [] graph){
        int indg[] = new int[graph.length];

        calculatIn(graph, indg);
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < graph.length ; i++){
            if(indg[i] == 0){
                q.add(i);
            }
        }

      

        while(! q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr+"   ");
            
            for(int i = 0 ; i < graph[curr].size(); i++){
                 Edge e = graph[curr].get(i);
                 indg[e.d]--;

                 if(indg[e.d] == 0)
                 {
                    q.add(e.d);
                 }
            }
        
        }
   }

   public static void main(String args[]){
    int V =6 ;
      ArrayList<Edge> [] graph = new ArrayList[V];
      creatGraph(graph);

      topSorting(graph);
   }

}

