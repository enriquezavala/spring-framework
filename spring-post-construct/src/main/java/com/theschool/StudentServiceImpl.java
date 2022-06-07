package com.theschool;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    public  StudentServiceImpl() {
        System.out.println("running student service constructor");
    }
}
