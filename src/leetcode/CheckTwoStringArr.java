package src.leetcode;

public class CheckTwoStringArr {
    public static void main(String[] args) {
        String[] word1 = {"dasd","das"};
        String[] word2 = {"dasd","das"};
        System.out.println(arrayStringsAreEqual(word1,word2));

    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder wordOne = new StringBuilder();
        StringBuilder wordTwo = new StringBuilder();
        for(String str: word1){
            wordOne.append(str);
        }
        for(String str: word2){
            wordTwo.append(str);
        }


        return wordOne.toString().equals(wordTwo.toString());
    }
}
