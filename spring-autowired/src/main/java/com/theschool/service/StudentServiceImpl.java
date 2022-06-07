package com.theschool.service;

import com.theschool.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Autowired // injects the repository into this service, field injection
    private StudentRepository studentRepository;

    @Override
    public List<String> findAll() {
        return studentRepository.findAll();
    }
}
