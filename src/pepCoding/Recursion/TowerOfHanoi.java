package src.pepCoding.Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        toh(3,'a','b','c');
    }

    private static void toh(int n, char t1id, char t2id, char t3id) {
        if(n==0){
            return;
        }

        toh(n-1, t1id,t3id,t2id);
        System.out.println(n + "[" + t1id + " -> " + t2id + "]");
        toh(n-1,t3id, t2id, t1id);
    }

}
