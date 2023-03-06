package com.pool.version8.streams.sorted;

import com.pool.version8.streams.util.StreamUtil;
import com.pool.version8.streams.util.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var collect = students.stream().sorted().collect(Collectors.toSet());
    }

}
