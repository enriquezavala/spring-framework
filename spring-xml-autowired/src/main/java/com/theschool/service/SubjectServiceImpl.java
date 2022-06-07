package com.theschool.service;

import com.theschool.repository.SubjectRepository;

import java.util.List;

public class SubjectServiceImpl implements SubjectService {
    private SubjectRepository subjectRepository;

    // autowired by constructor, constructor injection
    public SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public List<String> findAll() {
        return subjectRepository.findAll();
    }
}
