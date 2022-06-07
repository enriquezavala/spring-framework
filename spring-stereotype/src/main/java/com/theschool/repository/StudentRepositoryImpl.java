package com.theschool.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// this annotation also serves as a specialization of @Component,
// allowing for implementation classes to be autodetected through classpath scanning
@Repository // indicates that an annotated class is a "Repository"
public class StudentRepositoryImpl implements StudentRepository {
    Map<Long, String> students = new HashMap<>();

    public StudentRepositoryImpl() {
        students.put(1l, "Lovell");
        students.put(2l, "Harli");
        students.put(3l, "Danice");
        students.put(4l, "Joey");
        students.put(5l, "Kassie");
    }

    @Override
    public List<String> findAll() {
        return new ArrayList<>(students.values());
    }
}
