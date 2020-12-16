package uk.ac.cam.ej349;

import java.util.NoSuchElementException;

public class WithExceptions {

    public static String sEmail = "";
    public static void extractCamEmail(String sentence) {
        if (sentence==null || sentence.length()==0)
//            return -1;  // Error - sentence empty
            throw new IllegalArgumentException();
        String tokens[] = sentence.split(" "); // split into tokens
        for (int i=0; i< tokens.length; i++) {
            if (tokens[i].endsWith("@cam.ac.uk")) {
                sEmail=tokens[i];
                return;
//                return 0; // success
            } }
//        return -2; // Error - no cam email found
        throw new NoSuchElementException();
    }
    public static void main(String[] args) {
        try {
            WithExceptions.extractCamEmail("My email is rkh23@cam.ac.uk");
            System.out.println("Success: "+WithExceptions.sEmail);
        } catch (IllegalArgumentException e) {
            System.out.println("Supplied string empty");
        } catch (NoSuchElementException e) {
            System.out.println("No @cam address in supplied string");
        }
    }

}
