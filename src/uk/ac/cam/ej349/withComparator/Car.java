package uk.ac.cam.ej349.withComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Car {

    private String manufacturer;
    private int age;

    public Car(String manufacturer, int age) {
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

    public static void main(String[] args) {
        List<Car> test = new ArrayList<>(List.of(new Car("Honda", 10),
                new Car("Honda", 3), new Car("Apple", 10)));
        Collections.sort(test, new CarComparator());
        for (Car car : test) {
            System.out.println(car);
        }
    }
}
