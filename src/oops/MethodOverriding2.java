package src.oops;

public class MethodOverriding2 extends MethodOverriding{
    public static void main(String[] args) {
        MethodOverriding2 obj = new MethodOverriding2();
        obj.fun1();
    }
    @Override
    public void foo(){
        System.out.println("Hello from child");
        super.foo();
    }

    public void loo(){
        super.foo();
    }
}
