package uk.ac.cam.ej349.withoutComparator;

import uk.ac.cam.ej349.withComparator.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarWithoutComparator implements Comparable<CarWithoutComparator> {

    private String manufacturer;
    private int age;

    public CarWithoutComparator(String manufacturer, int age) {
        this.manufacturer = manufacturer;
        this.age = age;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return String.format("(%s, %d)", manufacturer, age);
    }

    @Override
    public int compareTo(CarWithoutComparator o) {
        return manufacturer.compareTo(o.getManufacturer());
    }

    public static void main(String[] args) {
        List<CarWithoutComparator> test = new ArrayList<>(List.of(new CarWithoutComparator("Honda", 10),
                new CarWithoutComparator("Honda", 3), new CarWithoutComparator("Apple", 10)));
        Collections.sort(test);
        System.out.println(test);
    }
}
