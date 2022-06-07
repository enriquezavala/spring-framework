package com.theschool.service;

import com.theschool.repository.StudentRepository;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentRepository repository;

    // injecting the repository into this service
    // constructor injection is better for required dependencies instead of setter injection
    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<String> findAll() {
        return repository.findAll();
    }
}
