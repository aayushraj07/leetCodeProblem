package src.leetcode;

public class SumRangeQuery {

    int[] inp = new int[(int) (Math.pow(10,4)+1)];
    int sum =0;

    public SumRangeQuery(int[] nums){
        this.inp = nums;
        for(int i =0; i <= inp.length-1; i++){
            sum += inp[i];
            inp[i] = sum;
        }
    }


    public int sumRange(int left, int right) {
        return inp[right] - (inp[left]-1);
    }

}
