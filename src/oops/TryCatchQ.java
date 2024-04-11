package src.oops;

public class TryCatchQ {
    public static void main(String args[])
    {
        InterviewBit1 obj1 = new InterviewBit1();
        int result = obj1.calculate(2, 3);
        System.out.println("Result: " + result);
    }
}
class InterviewBit1{

    int calculate(int a, int b)
    {
        try{
            return a-b;
        }catch(Exception e){
            return a+b;
        }finally{
            return a*b;
        }
    }
}
