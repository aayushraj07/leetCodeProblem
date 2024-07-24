package src.pepCoding.Graph;

import java.util.ArrayList;

public class FindPath {

    static class Edge{
        int src;
        int nbr;
        int weight;

        public Edge(int s, int n, int w){
            this.src = s;
            this.nbr = n;
            this.weight = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i =0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));

        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));

        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));

    }

    public static void main(String[] args) {
        int vertices = 4;
        ArrayList<Edge> graph[] = new ArrayList[vertices];
        createGraph(graph);
        boolean[] visited = new boolean[vertices];
        int src = 0;
        int dest = 3;
        System.out.println(haspath(graph, src, dest,visited ));
    }

    private static boolean haspath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited) {
        if(src == dest){
            System.out.print(src +" ");
            return true;
        }

        visited[src] = true;
        for(Edge edge : graph[src]){
            if(!visited[edge.nbr]){
                boolean hasNbrPath = haspath(graph, edge.nbr, dest, visited);
                if (hasNbrPath){
                    return true;
                }
            }
        }
        return false;
    }
}
