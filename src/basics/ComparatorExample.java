package src.basics;

import java.util.ArrayList;
import java.util.Comparator;

class Student{
    int marks;
    int rollno;
    String name;

    public Student(int marks, int rollno, String name){
        this.marks = marks;
        this.rollno = rollno;
        this.name = name;
    }
}

class StudentCompare implements Comparator<Student>{
    public int compare (Student a, Student b){
        return a.marks - b.marks;
    }

    public int compareRollno(Student a, Student b){
        return a.rollno- b.rollno;
    }
}

public class ComparatorExample {

    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();

        arr.add(new Student(56,1,"Aayush"));
        arr.add(new Student(72, 2, "Rajiv"));
        arr.add(new Student(98, 3, "Suman"));
        arr.add(new Student(88, 4, "Prabh"));


    }


}
