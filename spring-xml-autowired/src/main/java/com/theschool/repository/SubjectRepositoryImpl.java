package com.theschool.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubjectRepositoryImpl implements SubjectRepository {
    Map<Long, String> subjects = new HashMap<>();

    public SubjectRepositoryImpl() {
        subjects.put(1l, "Maths");
        subjects.put(2l, "History");
        subjects.put(3l, "Geography");
        subjects.put(4l, "Biology");
        subjects.put(5l, "Science");
    }

    @Override
    public List<String> findAll() {
        return new ArrayList<>(subjects.values());
    }
}
