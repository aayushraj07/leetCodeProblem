package src.leetcode;

import java.util.PriorityQueue;

public class CostOfRope {
    public static void main(String args[]){
        int[] arr = {4, 3, 2, 6};
        System.out.println("There is a array of number ropes size, find the minimum cost of adding each rope to other");
        for(int i=0; i<arr.length; i++){
            if(i!= arr.length-1){
                System.out.print(arr[i]+", ");
            }else {
                System.out.println(arr[i]);

            }
        }
        System.out.print("Minimum cost is : ");
        System.out.println(minCost(arr));
    }
    static int minCost(int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i = 0; i<arr.length;i++){
            pq.add(arr[i]);
        }
        int ans = 0;
        while(pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();
            int sum = first + second;
            ans += sum;
            pq.add(sum);
        }
        return ans;
    }
}
//2 4 5 6 8 9
//6 5 6 8 9    6
//11 5 6 8 9   17
//16 6 8 9     32
//22 8 9       54
//30 9         84
//39           123
//
//6 5 6 8 9    6
//11 6 8 9     17
//11 14 9      31
//20 14        51
//34           85
//
