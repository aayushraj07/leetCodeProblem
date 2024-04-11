package src.oops;

public class ShallowCopy {

    static class Rectange{
        int length = 3;
        int width = 4;
    }

    public static void main(String[] args) {
        Rectange ob1 = new Rectange();
        Rectange ob2 = new Rectange();
        ob1.length = 44;
        System.out.println(ob1.length);

    }
}
