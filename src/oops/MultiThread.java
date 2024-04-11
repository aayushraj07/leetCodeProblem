package src.oops;

public class MultiThread {
    public static void main(String[] args) {
        MulitThreadingThing multiThreadThing1 = new MulitThreadingThing();
        MulitThreadingThing multiThreadThing2 = new MulitThreadingThing();

        multiThreadThing1.start();
        multiThreadThing2.start();
    }

}
