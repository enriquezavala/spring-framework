package com.theschool.service;

import com.theschool.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SubjectServiceImpl implements SubjectService {
    private SubjectRepository subjectRepository;

    @Override
    public List<String> findAll() {
        return subjectRepository.findAll();
    }

    @Autowired // injects the repository into this service, setter injection
    public void setSubjectRepository(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }
}
