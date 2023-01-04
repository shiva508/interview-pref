package com.pool.version8.streams.util;

import java.util.Arrays;
import java.util.List;

public class StreamUtill {

    public static List<Student> studentsBuilder() {

        return Arrays.asList(new Student("Shiva", "Dasari", 18, 32, "M"),
                new Student("Satish", "Dasari", 16, 34, "M"),
                new Student("Ravi", "Dasari", 15, 20, "M"),
                new Student("Rajeswari", "Dasari", 16, 20, "F"),
                new Student("Mounika", "Dasari", 16, 20, "F"),
                new Student("Kavya", "Dasari", 16, 20, "F"));
    }
}
