package software.reuse;

import java.util.ArrayList;
import java.util.Collections;

public class Task4Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(30, 3.2));
        list.add(new Student(10, 3.9));
        list.add(new Student(20, 3.5));

        Collections.sort(list);                    // Comparable
        System.out.println("Sorted by Roll No (ascending):");
        list.forEach(System.out::println);

        list.sort(new CgpaComparator());           // Comparator
        System.out.println("\nSorted by CGPA (descending):");
        list.forEach(System.out::println);
    }
}
