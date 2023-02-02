package com.pool.version8.streams.count;

import java.util.List;

import com.pool.version8.streams.util.StreamUtill;
import com.pool.version8.streams.util.Student;

public class StreamCountClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtill.studentsBuilder();
        int total = students.stream().mapToInt(Student::getEduLevel).sum();
        System.out.println(total);
    }
}
