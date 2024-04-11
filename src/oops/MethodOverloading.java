package src.oops;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(findArr(23,4));
        System.out.println(findArr(23,4,21));

    }

    public static int findArr(int l, int b){
        int area = l * b;
        return area;
    }
    public static int findArr(int l, int b, int h){
        int area = l * b* h;
        return area;
    }
}
