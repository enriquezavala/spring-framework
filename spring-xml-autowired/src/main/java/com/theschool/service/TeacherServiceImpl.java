package com.theschool.service;

import com.theschool.repository.TeacherRepository;

import java.util.List;

public class TeacherServiceImpl implements TeacherService {

    private TeacherRepository teacherRepository;

    @Override
    public List<String> findAll() {
        return teacherRepository.findAll();
    }

    // autowired by type, setter injection
    public void setTeacherRepository(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }
}
