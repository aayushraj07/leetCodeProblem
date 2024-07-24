package src.oops.javaBasic;

import java.util.*;

public class Lenvssize {
    public static void main(String[] args) {
        int abc = 431312;
        int[] arr = {1,3,5,5,2};
        List<String> list = new ArrayList<>();
        list.add("Aayush");
        System.out.println(list);
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        ArrayList<int[]> listOfArrays = new ArrayList<>();

        // Add some int arrays to the list
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6, 51};
        int[] array3 = {7, 8, 9};

        listOfArrays.add(array1);
        listOfArrays.add(array2);
        listOfArrays.add(array3);

        System.out.println(listOfArrays);

        ArrayList<String>[] arrayList = new ArrayList[4];
        System.out.println("//");
        System.out.println(Arrays.toString(arrayList));

        HashMap<String,String> map = new HashMap();
        map.put("a", "aayush");
        System.out.println(map.size());

        HashSet<Integer> set = new HashSet<>();
        set.add(331);
        System.out.println(set.size());
        System.out.println(set);

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(312);
        System.out.println(queue.size());
        System.out.println(queue);


        String al = "Aayush";
        System.out.println(al.length());

        StringBuilder eqw= new StringBuilder();
        eqw.append("Raj");
        System.out.println(eqw.length());
        Stack<String> stack = new Stack<>();

        stack.push("Aa");
        stack.push("yu");
        System.out.println(stack.size());
        System.out.println(stack);
        Set<String> set1 = new HashSet<>();
    }
}
