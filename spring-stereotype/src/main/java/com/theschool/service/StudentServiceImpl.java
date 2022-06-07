package com.theschool.service;

import com.theschool.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// this annotation serves as a specialization of @Component,
// allowing for implementation classes to be autodetected through classpath scanning
@Service // indicates that an annotated class is a "Service"
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<String> findAll() {
        return studentRepository.findAll();
    }
}
