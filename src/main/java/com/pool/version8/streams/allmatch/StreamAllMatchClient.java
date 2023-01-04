package com.pool.version8.streams.allmatch;

import java.util.List;
import java.util.function.Predicate;

import com.pool.version8.streams.util.StreamUtill;
import com.pool.version8.streams.util.Student;

public class StreamAllMatchClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtill.studentsBuilder();
        String lastNameInput = "Dasari";
        String firstNameInput = "Shiva";
        allMatchPositive(students, lastNameInput);
        allMatchnagative(students, firstNameInput);

    }

    private static void allMatchPositive(List<Student> students, String lastNameInput) {
        Predicate<String> nameConatins = lastName -> lastName.contains(lastNameInput);
        boolean alllastNameMatched = students.stream().allMatch(student -> nameConatins.test(student.getLastName()));
        System.out.println("All MATCH:" + alllastNameMatched);
    }

    private static void allMatchnagative(List<Student> students, String lastNameInput) {
        Predicate<String> nameConatins = lastName -> lastName.contains(lastNameInput);
        boolean alllastNameMatched = students.stream().allMatch(student -> nameConatins.test(student.getLastName()));
        System.out.println("All MATCH:" + alllastNameMatched);
    }
}
