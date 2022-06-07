package com.theschool.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
// indicates that a component is eligible for registration when one or more specified profiles are active
@Profile("dev") // this bean will be available for dev environment
public class StudentRepositoryDevImpl implements StudentRepository {
    Map<Long, String> students = new HashMap<>();

    public StudentRepositoryDevImpl() {
        students.put(1l, "Lovell");
    }

    @Override
    public List<String> findAll() {
        return new ArrayList<>(students.values());
    }
}
