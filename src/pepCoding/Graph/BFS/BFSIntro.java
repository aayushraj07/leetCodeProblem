package src.pepCoding.Graph.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class BFSIntro {

    static class Pair {
        int v;
        String psf;

        Pair(int v, String psf){
            this.v = v;
            this.psf = psf;
        }
    }

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

        ArrayDeque<Pair> deque = new ArrayDeque<>();
        deque.add(new Pair(src, src + ""));
        boolean[] visited = new boolean[vrtc];
        while(deque.size() > 0){
            Pair rem = deque.removeFirst();
            if(visited[rem.v]){
                continue;
            }
            visited[rem.v] = true;
            System.out.println(rem.v + "@" + rem.psf);

            for (Edge e : graph[rem.v]){
                if(!visited[e.nbr]){
                    deque.add(new Pair(e.nbr, rem.psf + e.nbr));
                }
            }

        }
    }
}
