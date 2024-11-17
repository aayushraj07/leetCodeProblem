package src.basics.Compare;
import java.util.*;

public class LaptopCompare {
    public static void main(String[] args) {
        List<Laptop> list = new ArrayList<>();
        list.add(new Laptop("Apple", 8, 2022));
        list.add(new Laptop("Lenovo", 8, 2015));
        list.add(new Laptop("thinkpad", 16, 2020));
        list.add(new Laptop("batcomp", 16, 2021));

        Comparator<Laptop> comp = new Comparator<Laptop>() {
            public int compare(Laptop o1, Laptop o2) {
                if(o1.getRam()>o2.getRam()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

//        this is done by comparable
        Collections.sort(list);
//        below one is done my comparator
        Collections.sort(list, comp);

        for(Laptop lp : list){
            System.out.println("Laptop name " + lp.getBrand() +" and ram is " + lp.getRam());
        }
    }
}
