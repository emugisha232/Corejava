package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortUsingComparator {

    private ArrayList<Integer> l;

    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();
        l.add(23);
        l.add(0);
        l.add(5);
        l.add(11);
        l.add(4);
        l.add(30);
        System.out.println("Before Sorting.....");
        System.out.println(l);
        Comparator<Integer> c = (o1, o2) -> (o1 < o2) ? -1 : (o1 > o2) ? 1 : 0;
        Collections.sort(l, c);
        System.out.println("After Sorting...");
        System.out.println(l);
        System.out.println("Display each value....");
        l.stream().forEach(System.out::println);


    }


}
