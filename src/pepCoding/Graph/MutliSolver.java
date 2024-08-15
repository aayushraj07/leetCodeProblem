package src.pepCoding.Graph;

import src.pepCoding.BinaryTree.BinaryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class MutliSolver {


    static class Pair implements  Comparable<Pair>{
        int wt;
        String path;

        public Pair(int wt, String path){
            this.wt = wt;
            this.path = path;
        }
        public int compareTo(Pair o){
            return this.wt - o.wt;
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
        int dest = Integer.parseInt(br.readLine());
        boolean[] visited = new boolean[vrtc];
        int criteria = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        multiSolver(graph, src, dest, visited, criteria, k, src + "", 0);
        System.out.println("Smallest Path " + spath + "@" + spathwt);
        System.out.println("Largest Path " + lpath + "@" + lpathwt);
        System.out.println("Just Larger Path than " + criteria + " = " + cpath + "@" + cpathwt);
        System.out.println("Just Smaller Path than " + criteria + " = " + fpath + "@" + fpathwt);
        System.out.println(k + "th largest path = " + pq.peek().path + "@" + pq.peek().wt);
    }
//    c -> Ceil (just bigger), f -> floor (just smaller)
    static String spath;
    static String lpath;
    static Integer spathwt = Integer.MAX_VALUE;
    static Integer lpathwt = Integer.MIN_VALUE;
    static String cpath;
    static Integer cpathwt = Integer.MAX_VALUE;
    static String fpath;
    static Integer fpathwt = Integer.MIN_VALUE;
    static PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
    private static void multiSolver(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited, int criteria, int k, String psf, int wsf) {
        if(src == dest){
            if (wsf < spathwt){
                spathwt = wsf;
                spath = psf;
            }
            if(wsf > lpathwt){
                lpathwt = wsf;
                lpath = psf;
            }
            if(wsf > criteria && wsf < cpathwt){
                cpathwt = wsf;
                cpath = psf;
            }
            if (wsf < criteria && wsf > fpathwt){
                fpathwt = wsf;
                fpath = psf;
            }
            if(pq.size() < k){
                pq.add(new Pair(wsf, psf));
            }else{
                assert pq.peek() != null;
                if (wsf > pq.peek().wt){
                    pq.remove();
                    pq.add(new Pair(wsf, psf));
                }
            }
            return;
        }

        visited[src] = true;
        for (Edge edge : graph[src]){
            if (!visited[edge.nbr]){
                multiSolver(graph, src, dest, visited, criteria, k, psf+ edge.nbr, wsf + edge.weight);
            }
        }
        visited[src] = false;
    }

}
