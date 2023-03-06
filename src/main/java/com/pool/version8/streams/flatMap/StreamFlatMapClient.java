package com.pool.version8.streams.flatMap;

import com.pool.version8.streams.util.Role;
import com.pool.version8.streams.util.StreamUtil;
import com.pool.version8.streams.util.Student;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamFlatMapClient {
    public static void main(String[] args) {
        flattening();
        flatteningAndMapping();
    }

    private static void flatteningAndMapping() {
        List<Student> students = StreamUtil.studentsBuilder();
        Set<Role> collect = students.stream().flatMap(sts -> sts.getRoles().stream()).collect(Collectors.toSet());
        System.out.println(collect);
    }

    private static void flattening() {
        List<String> batchOne= Arrays.asList("Shiva","Satish","Ravi");
        List<String> batchTwo= Arrays.asList("Batman","Superman","Ironman");
        List<List<String>> treeBranch=Arrays.asList(batchOne,batchTwo);
        List<String> stringList = treeBranch.stream().flatMap(Collection::stream).toList();
        stringList.forEach(System.out::println);
    }
}
