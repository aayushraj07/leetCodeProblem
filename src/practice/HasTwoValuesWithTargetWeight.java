package src.practice;

import java.util.HashSet;

public class HasTwoValuesWithTargetWeight {
    public static void main(String[] args) {
        int[] weights = {2, 7, 11, 15};
        int targetWeight = 9;

        if(hasTwoValue(weights, targetWeight)){
            System.out.println("Above are the values");
        }else{
            System.out.println("No Values in the array equals the target");
        }
    }

    private static Boolean hasTwoValue(int[] weights, int targetWeight) {

        HashSet<Integer> seenWeights = new HashSet<>();

        for (int weight : weights){
            int complementWeight = targetWeight - weight;
            if(seenWeights.contains(complementWeight)){
                System.out.println(complementWeight + ", " + weight);
                return true;
            }
            seenWeights.add(weight);
        }
        return false;
    }

}
