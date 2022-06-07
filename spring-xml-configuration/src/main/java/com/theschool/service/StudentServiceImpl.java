package com.theschool.service;

import com.theschool.repository.StudentRepository;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    @Override
    public List<String> findAll() {
        return studentRepository.findAll();
    }

    // injecting the repository into this service, setter injection
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
