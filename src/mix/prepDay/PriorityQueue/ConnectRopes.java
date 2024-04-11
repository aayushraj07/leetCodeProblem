package prepDay.PriorityQueue;

import java.util.PriorityQueue;

public class ConnectRopes {
    public static void main(String[] args) {
        int[] nums = {1,2,37,4,3,5,9};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0; i<nums.length; i++){
            pq.add(i);
        }
        int ans =  0;
        while(pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();
            int sum = first + second;
            ans += sum;
            pq.add(sum);
        }
        System.out.println(ans);
    }
}
