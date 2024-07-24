package src.pepCoding.HashMapAndHeap;

import java.util.HashMap;

public class GetCommonElement2 {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,2,2,4,5};
        int[] arr2 = {1,1,1,2,2,3,5};
        getCommon(arr1, arr2);
    }

    public static void getCommon(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> map1 = new HashMap<>();

        for(int val : arr1){
            if(map1.containsKey(val)){
                int pf = map1.get(val);
                int nf = pf+1;
                map1.put(val, nf);
            }else{
                map1.put(val,1);
            }
        }

        for(int val: arr2){
            if(map1.containsKey(val) && map1.get(val) > 0){
                System.out.println(val);
                int pf = map1.get(val);
                int nf = pf-1;
                map1.put(val, nf);
            }
        }
    }
}
