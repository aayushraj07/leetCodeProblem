package src.pepCoding.PriorityQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    public static class Pair implements Comparable<Pair>{
        int listIndex;
        int dataIndex;
        int val;

        Pair(int listIndex, int dataIndex, int val){
            this.listIndex = listIndex;
            this.dataIndex = dataIndex;
            this.val = val;
        }

        public int compareTo(Pair o){
            return this.val - o.val;
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 2, 3)),
                new ArrayList<>(Arrays.asList(4, 5, 6)),
                new ArrayList<>(Arrays.asList(7, 8, 9)),
                new ArrayList<>(Arrays.asList(10, 11, 12))
        ));
        System.out.println(mergeKSorted(lists));
    }

    public static List<Integer> mergeKSorted(ArrayList<ArrayList<Integer>> lists) {
        List<Integer> res = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i =0; i< lists.size(); i++){
            Pair p = new Pair(i, 0, lists.get(i).get(0));
            pq.add(p);
        }

        while(pq.size()> 0){
            Pair p = pq.remove();
            res.add(p.val);
            p.dataIndex++;

            if(p.dataIndex < lists.get(p.listIndex).size()){
                p.val = lists.get(p.listIndex).get(p.dataIndex);
                pq.add(p);
            }
        }
    return res;
    }

}
