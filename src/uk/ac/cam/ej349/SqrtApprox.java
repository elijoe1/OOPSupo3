package uk.ac.cam.ej349;

import javax.naming.PartialResultException;

public class SqrtApprox {

    private static final double EPSILON = 0.01;
    // Here I am only calculating the positive root, but the negative root is trivial (just negate)
    private static double approx(double number) {
        double newNumber1 = number;
        if (number < 0) {
            throw new ArithmeticException();
        } else {
            // Equivalently, we find the root of f(x) = x^2 - a, or x such that x^2 = a, x = sqrt(a)
            // Note this will always converge as if a is positive, there are always two roots to the function
            // And the function is strictly increasing from the root to x = number
            double newNumber = 0;
            while (Math.abs(newNumber1 - newNumber) > EPSILON) {
                newNumber = newNumber1;
                newNumber1 = newNumber - (Math.pow(newNumber, 2) - number) / (2 * newNumber);
            }
            return newNumber1;
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(approx(432623496));
        } catch (ArithmeticException e) {
            System.out.println("Cannot root a negative number!");
        }
    }
}
