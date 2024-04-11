package src.oops;

public class StringPool {
    public static void main(String[] args) {
        String a = "John";
        String b = "John";
        String c = new String("John");
        String d = "Johnny";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(c==a);

    }
}
