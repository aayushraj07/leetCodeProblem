package src.oops;

public class MethodOverriding {
    public static void fun1(){
        System.out.println("This method from parent class");
    }
    public void doo(){
        System.out.println("Yeh bhe chalega!");
    }
    MethodOverriding(){
        System.out.println("Yeh chalega!");
        this.doo();
    }



    public void foo(){
        System.out.println("Hello from Parent");
    }
}
