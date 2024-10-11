import java.util.*;
public class DirCycle {
    public static class Edge{
       int s;
       int d;
       int wt;

       public Edge(int s , int d, int wt){
        this.s = s ;
        this.d = d;
        this.wt = wt;
       }
    }

    public static void creatGraph(ArrayList<Edge> [] graph){
        for(int i = 0; i < graph.length ; i++){
             graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));

        graph[1].add(new Edge(1, 3, 1));

        // graph[2].add(new Edge(2, 3, 1));
        
        graph[3].add(new Edge(3, 0, 1));


    }

    public static boolean isCycle(ArrayList<Edge> [] graph , int curr , boolean vis[] , boolean stack[]){
         vis[curr] = true;
         stack[curr] = true;

         for(int i = 0; i < graph[curr].size() ; i++){
             Edge e = graph[curr].get(i);
             if(stack[e.d]){
                
                 return true;
             }
             else if(!vis[curr] ){
                if(isCycle(graph, e.d, vis, stack)){
                    return true;
                }
                
             }
         }
        //  stack[curr] = false;
         return false;
    }
    public static void main(String args[]){
        int V = 4;
      
        ArrayList<Edge> [] graph = new ArrayList[V];
        creatGraph(graph);
        System.out.println(isCycle(graph, 1 , new boolean[V], new boolean[V]));
    }
}
