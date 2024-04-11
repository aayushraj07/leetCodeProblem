package src.oops;

import java.util.ArrayList;

public class BoxWeight extends Box{
    double weight;

    static int calc(double weight, double l , double h,double w){
        int ans = (int) (weight*l*h);
        return ans;
    }

    public BoxWeight() {
        this.weight = -1;
    }

//    @Override

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h  , w);
        this.weight = weight;
    }


        static void greeting() {
        System.out.println("Hey, I am in BoxWeight class. Greetings!");
        ArrayList list = new ArrayList();
    }
}
