package uk.ac.cam.ej349.withComparator;

import uk.ac.cam.ej349.withComparator.Car;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getManufacturer().compareTo(o2.getManufacturer()) > 0) {
            return 1;
        } else if (o1.getManufacturer().compareTo(o2.getManufacturer()) < 0) {
            return -1;
        } else {
            return o1.getAge() - o2.getAge();
        }
    }
}
