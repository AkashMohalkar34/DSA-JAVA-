import java.util.ArrayList;

public class Cycle {

    public static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src , int dest , int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> [] graph){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 5));

        // vertex  1;
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // vertex 2
        graph[2].add(new Edge(2, 1, 1));
        // graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // vertex 3
        // graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3, 1, 3));

        // vertex 4
        graph[4].add(new Edge(4, 2, 2));
    }
    public static boolean isCycle(ArrayList<Edge> [] graph , int curr , int par, boolean vis[]){
         vis[curr] = true;
         for(int i = 0 ; i < graph[curr].size() ;i++)
         {
             Edge e = graph[curr].get(i);
             if(vis[e.dest] && par != e.dest){
                return true;
             }
             else if(!vis[e.dest])
            {
                   if(isCycle(graph, e.dest, curr, vis)){
                    return true;
                   }
            }
        }
         
         return false;
    }
    public static void main(String args[]){
        int v = 5;
        ArrayList<Edge> [] graph = new ArrayList[v];
        createGraph(graph);
        System.out.println(isCycle(graph, 0, -1, new boolean[v]));
    }
}
