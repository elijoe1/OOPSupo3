package uk.ac.cam.ej349;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        CollectionArrayList<Integer> test = new CollectionArrayList<>();
//        test.add(3);
//        test.add(7);
//        System.out.println(test);
//        test.add(123);
//        System.out.println(test);
//        test.set(2, 341);
//        System.out.println(test.size());
//        System.out.println(Mean.iterator(List.of()));
//        String s1 = new String("Hi");
//        String s2 = new String("Hi");
//        System.out.println( (s1.equals(s2)) );
//        String s3 = "Hi";
//        String s4 = "Hi";
//        System.out.println( (s3.equals(s4)) );
        List<Point> test = new ArrayList<>(List.of(new Point(3, 4, 1), new Point(3,8,3),
                new Point(7,4,1), new Point(9,2,1)));
        Collections.sort(test);
        System.out.println(test);

    }
}
