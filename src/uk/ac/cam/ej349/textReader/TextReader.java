package uk.ac.cam.ej349.textReader;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*;

public class TextReader {

    private static List<List<Integer>> extractPairs(File file) {
        try {
            Scanner myReader = new Scanner(file);
            List<List<Integer>> pairsList = new ArrayList<>();
            while (myReader.hasNextLine()) {
                String currentLine = myReader.nextLine();
                String[] stringInts = currentLine.split(", ");
                List<Integer> ints = new ArrayList<>();
                for (String s : stringInts) {
                    ints.add(Integer.parseInt(s));
                }
                pairsList.add(ints);
            }
            return pairsList;
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
        throw new RuntimeException();
    }

    private static List<List<Integer>> sortPairs(File file) {
        List<List<Integer>> pairs = extractPairs(file);
        Comparator<List<Integer>> firstSecond = (o1, o2) -> {
            int o11 = o1.get(0);
            int o12 = o1.get(1);
            int o21 = o2.get(0);
            int o22 = o2.get(1);
            if (o11 == o21) {
                if (o12 == o22) {
                    return 0;
                } else {
                    return o12 - o22;
                }
            } else {
                return o11 - o21;
            }
        };
        pairs.sort(firstSecond);
        return pairs;
    }

    public static void printSortedPairs(File file) {
        List<List<Integer>> pairs = sortPairs(file);
        for (List<Integer> pair : pairs) {
            System.out.printf("%d, %d%n", pair.get(0), pair.get(1));
        }
    }

    public static void main(String[] args) {
        File myObj = new File("src/uk/ac/cam/ej349/textReader/text");
        TextReader.printSortedPairs(myObj);
    }
}
