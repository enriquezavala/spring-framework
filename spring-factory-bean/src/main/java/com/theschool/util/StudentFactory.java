package com.theschool.util;

import com.theschool.model.Student;
import org.springframework.beans.factory.FactoryBean;

public class StudentFactory implements FactoryBean<Student> {
    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public Student getObject() throws Exception {
        return new Student(school);
    }

    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
