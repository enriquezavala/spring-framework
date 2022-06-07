package com.theschool.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeacherRepositoryImpl implements TeacherRepository {
    Map<Long, String> teachers = new HashMap<>();

    public TeacherRepositoryImpl() {
        teachers.put(1l, "Enrique");
        teachers.put(2l, "Marena");
        teachers.put(3l, "Tandy");
        teachers.put(4l, "Lynett");
        teachers.put(5l, "Jason");
    }

    @Override
    public List<String> findAll() {
        return new ArrayList<>(teachers.values());
    }
}
