package src.leetcode.LinkedList;

import java.util.ArrayList;
import java.util.List;


public class TrappedWaterHard {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int ans = trap(height);
        System.out.println(ans);
    }

    static class Pair<T, U> {
        public T first;
        public U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public U getSecond() {
            return second;
        }
    }

    public static int trap(int[] height) {
        int trappedWater =0;
        int curr =0;
        int i = 0;
        int j = 2;
        List<Pair<Integer, Integer>> pairs = new ArrayList<>();

        while(j< height.length){
            int mid = i+1;
            if(height[i]> height[mid] && height[j] > height[mid]){
                pairs.add(new Pair<>(i, j));
            }
            i++;
            j++;
        }
        for (Pair<Integer, Integer> pair : pairs) {
            Integer key = pair.getFirst();
            Integer value = pair.getSecond();
            if(key>value){
                trappedWater += key - value;
            }else{
                trappedWater += value - key;
            }
        }
        return trappedWater;

    }
}
