package com.pool.version8.streams.distinct;

import java.util.List;
import java.util.stream.Collectors;
import com.pool.version8.streams.util.StreamUtil;
import com.pool.version8.streams.util.Student;

public class StreamDistinctClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        List<String> names = students.stream().map(Student::getGender).distinct().collect(Collectors.toList());
        System.out.println(names);
    }
}
