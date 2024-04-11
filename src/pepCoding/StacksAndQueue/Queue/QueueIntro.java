package src.pepCoding.StacksAndQueue.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueIntro {

    public static void main(String[] args) {
        Queue<Integer> q= new ArrayDeque<>();
        q.add(10);
        q.add(20);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
        q.add(40);
        System.out.println(q.peek());
    }
}
