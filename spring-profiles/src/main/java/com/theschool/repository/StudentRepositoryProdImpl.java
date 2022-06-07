package com.theschool.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Profile("prod") // this bean will be available for prod environment
public class StudentRepositoryProdImpl implements StudentRepository {
    Map<Long, String> students = new HashMap<>();

    public StudentRepositoryProdImpl() {
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
