import java.util.ArrayList;

public class PrintPath {
    public static class Edge{
        int s; 
         int d ;
         int wt;

         public Edge(int s, int d , int wt){
            this.s = s;
            this.d = d;
            this.wt = wt;
         }
    }

     public static void creatGraph(ArrayList<Edge> [] graph){
             for(int i = 0; i < graph.length; i++){
                graph[i] = new ArrayList<>();
             }

             graph[0].add(new Edge(0, 1, 1));
             graph[0].add(new Edge(0, 2, 1));

             graph[1].add(new Edge(1, 0, 1));
             graph[1].add(new Edge(1, 3, 1));

             graph[2].add(new Edge(2, 0, 1));
             graph[2].add(new Edge(2, 4, 1));
 
             graph[3].add(new Edge(3, 1, 1));
             graph[3].add(new Edge(3, 4, 1));
             graph[3].add(new Edge(3, 5, 1));

             graph[4].add(new Edge(4, 2, 1));
             graph[4].add(new Edge(4, 3, 1));
             graph[4].add(new Edge(4, 5, 1));

             graph[5].add(new Edge(5, 3, 1));
             graph[5].add(new Edge(5, 4, 1));
             graph[5].add(new Edge(5, 6, 1));


             graph[6].add(new Edge(6, 5, 1));


    }
    public static void dfs(ArrayList<Edge> [] graph , int src , int dest , String path , boolean vis[]){
         if(src == dest){
            System.out.println(path+""+dest);
            return ;
         }
         
         for(int i = 0; i < graph[src].size();i++){
            Edge e = graph[src].get(i);
            if(!vis[e.d]){
                 vis[src] = true;
                 dfs(graph, e.d, dest, path + e.s, vis);
                 vis[src] = false;
            }

         }
    }
    public static void main(String args[]){
        int V = 7;
        ArrayList<Edge> [] graph = new ArrayList[V];
        creatGraph(graph);
        dfs(graph, 0, 5, "", new boolean[V]);
    }
}
