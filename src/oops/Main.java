package src.oops;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.6, 7.9, 9.9);
        box1.getL();
        Box box2 = new Box(box1);

        BoxWeight box = new BoxWeight();
        BoxWeight.greeting();
        box.calc(2,3,3,5);
    }
}
