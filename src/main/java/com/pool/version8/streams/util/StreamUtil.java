package com.pool.version8.streams.util;

import java.util.Arrays;
import java.util.List;

public class StreamUtil {

    public static List<Student> studentsBuilder() {
        List<Role> user= List.of(new Role("USER"));
        List<Role> useradmin=Arrays.asList(new Role("USER"),new Role("ADMIN"));

        return Arrays.asList(new Student("Shiva", "Dasari", 18, 32, "M",user),
                new Student("Satish", "Dasari", 16, 34, "M",useradmin),
                new Student("Ravi", "Dasari", 15, 20, "M",user),
                new Student("Rajeswari", "Dasari", 16, 20, "F",useradmin),
                new Student("Mounika", "Dasari", 16, 18, "F",user),
                new Student("Kavya", "Dasari", 16, 16, "F",useradmin));
    }
}
