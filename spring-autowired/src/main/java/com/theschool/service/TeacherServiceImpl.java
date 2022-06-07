package com.theschool.service;

import com.theschool.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TeacherServiceImpl implements TeacherService {
    private TeacherRepository teacherRepository;

    @Autowired // injects the repository into this service, constructor injection
    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<String> findAll() {
        return teacherRepository.findAll();
    }
}
