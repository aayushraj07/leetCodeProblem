package src.pepCoding.Graph.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class IsGraphCyclic {


    static class Pair {
        int v;
        String psf;

        Pair(int v, String psf) {
            this.v = v;
            this.psf = psf;
        }
    }

    public static class Edge {
        int src;
        int nbr;
        int weight;

        public Edge(int src, int nbr, int weight) {
            this.src = src;
            this.nbr = nbr;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vrtc = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vrtc];
        for (int i = 0; i < vrtc; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        boolean[] visited = new boolean[vrtc];
        for (int v = 0; v < vrtc; v++) {
            if (visited[v] == false) {
//           traverse
            boolean cycle = isCyclic(graph,v,visited);
            if (cycle){
                System.out.println(true);
                return;
            }
            }
        }
    }

    //    Remove -  Mark Visited  - Work - Add
    public static boolean isCyclic(ArrayList<Edge>[] graph, int src, boolean[] visited) {
        ArrayDeque<Pair> q = new ArrayDeque<>();
        q.add(new Pair(src, src + ""));

        while (q.size() > 0) {
            Pair remove = q.removeFirst();

            if (visited[remove.v] == true) {
                return true;
            }
            for (Edge edge : graph[remove.v]) {
                if (visited[edge.nbr] == false) {
                    q.add(new Pair(edge.nbr, remove.psf + edge.nbr));
                }
            }
        }
        return false;
    }
}
