package src.basics.Compare;

public class Laptop implements Comparable<Laptop> {
    String brand;
    int ram;
    int modelyear;


    public Laptop(String brand, int ram, int modelyear) {
        this.brand = brand;
        this.ram = ram;
        this.modelyear = modelyear;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getModelyear() {
        return modelyear;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setModelyear(int modelyear) {
        this.modelyear = modelyear;
    }

    @Override
    public int compareTo(Laptop o) {
        if(this.getRam() > o.getRam()){
            return 1;
        }
        if(this.getRam() < o.getRam()){
            return -1;
        }else{
            return 0;
        }
    }
}
