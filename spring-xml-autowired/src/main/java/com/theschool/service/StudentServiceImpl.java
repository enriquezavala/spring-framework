package com.theschool.service;

import com.theschool.repository.StudentRepository;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Override
    public List<String> findAll() {
        return studentRepository.findAll();
    }

    // autowired by name, setter injection
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
