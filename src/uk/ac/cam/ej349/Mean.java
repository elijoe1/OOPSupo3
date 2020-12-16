package uk.ac.cam.ej349;

import java.util.Iterator;
import java.util.List;

public class Mean {

    public static double forLoop(List<Integer> numbers) {
        int total = 0;
        if(numbers.isEmpty()) {
            throw new ArithmeticException();
        }
        for (int i = 0; i < numbers.size(); i++) {
            total += numbers.get(i);
        }
        return (double)total / (double)numbers.size();
    }

    public static double forEachLoop(List<Integer> numbers) {
        int total = 0;
        if(numbers.isEmpty()) {
            throw new ArithmeticException();
        }
        for (Integer i : numbers) {
            total += i;
        }
        return (double)total / (double)numbers.size();
    }

    public static double iterator(List<Integer> numbers) {
        Iterator<Integer> it = numbers.iterator();
        int total = 0;
        if(numbers.isEmpty()) {
            throw new ArithmeticException();
        }
        while(it.hasNext()) {
            total += it.next();
        }
        return (double)total / (double)numbers.size();
    }
}
