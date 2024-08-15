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
//6

public class PrintAllPath {

    public static class Edge{
        int src;
        int nbr;
        int wt;

        public Edge(int src, int nbr, int wt){
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
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
        printAllPath(graph, src, dest, visited, "");

    }

    private static void printAllPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited, String psf) {
        if(src == dest){
            System.out.println(psf);
            return;
        }

        visited[src] = true;
        for (Edge edge : graph[src]){
            if(!visited[edge.nbr]){
                printAllPath(graph, edge.nbr, dest, visited, psf+" "+edge.nbr);
            }
        }
        visited[src] = false;
    }
}
