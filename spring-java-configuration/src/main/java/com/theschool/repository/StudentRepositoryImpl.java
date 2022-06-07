package com.theschool.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
