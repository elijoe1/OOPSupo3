package uk.ac.cam.ej349;

public class CovariantArrays {

    public static void main(String[] args) {
        String[] s = new String[]{"test", "hello!"};

        // this compiles as arrays are covariant (String subtype of Object so String[] subtype of Object[])
        // here we are doing implicit widening
        Object[] o = s;

        // for the sake of comparison, a new Object[]
        Object[] p = new Object[2];

        // Again works because of covariance - o[0] is actually a String but we can do implicit widening again
        Object v = o[0];

        // this compiles because you can add an Integer (which 5 is auto-boxed to) to an array of Objects
        // however, o[] is actually an array of Strings, so you cannot put an Integer in it
        o[1] = 5;

        // this will not fail at runtime because p is actually an array of Objects
        p[1] = 5;
    }
}
