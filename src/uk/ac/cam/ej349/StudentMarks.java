package uk.ac.cam.ej349;

import java.util.*;

public class StudentMarks {

    Map<String, Double> marksList;

    public List<String> getStudents() {
        return new ArrayList<>(marksList.keySet());
    }

    public StudentMarks() {
        marksList = new TreeMap<>();
    }

    public List<String> topPercent(double p) {
        if (p < 0 || p > 100) {
            throw new IllegalArgumentException();
        } else {
            int top = (int)Math.floor(marksList.size() * (p / 100));
            List<Map.Entry<String, Double>> list = new ArrayList<>(marksList.entrySet());
            Comparator<Map.Entry<String, Double>> byMark = Map.Entry.comparingByValue();
            list.sort(byMark.reversed());
            List<String> students = new ArrayList<>();
            double topVal = list.get(top-1).getValue();
            System.out.println(topVal);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getValue() >= topVal) {
                    students.add(list.get(i).getKey());
                }
            }
            return students;
        }
    }

    public double medianMark() {
        double medianIndex = ((double)marksList.size() + 1.) / 2. - 1.;
        List<Map.Entry<String, Double>> list = new ArrayList<>(marksList.entrySet());
        Comparator<Map.Entry<String, Double>> byMark = Map.Entry.comparingByValue();
        list.sort(byMark.reversed());
        if (medianIndex % 2 == 0) {
            return list.get((int)medianIndex).getValue();
        } else {
            return (list.get((int)Math.floor(medianIndex)).getValue() + list.get((int)Math.ceil(medianIndex)).getValue()) / 2;
        }
    }
}
