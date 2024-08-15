package src.pepCoding.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//7
//8
//0 1 10
//1 2 10
//2 3 10
//0 3 10
//3 4 2
//4 5 3
//5 6 3
//4 6 8
//0


public class HasPAth {

    public static class Edge{
        int src;
        int nbr;
        int weight;

        public Edge (int src, int nbr, int weight){
            this.src = src;
            this.nbr = nbr;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vrtc = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vrtc];
        for (int i =0; i< vrtc; i++){
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i< edges;i++){
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        int src = Integer.parseInt(br.readLine());
        int dest = Integer.parseInt(br.readLine());
        boolean[] visited = new boolean[vrtc];
        boolean res = hasPath(graph, src, dest, visited);
        System.out.println(res);
    }

    private static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited) {
        if(src == dest){
            return true;
        }

        visited[src] = true;
            for (Edge edge : graph[src]){
                if(!visited[edge.nbr]){
                    boolean hashNbrPath = hasPath(graph,edge.nbr, dest, visited);
                    if (hashNbrPath){
                        return true;
                    }
            }
        }
            return  false;

    }
}
