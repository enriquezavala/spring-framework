package com.theschool;

import com.theschool.service.StudentService;
import com.theschool.service.StudentServiceImpl;
import com.theschool.service.TeacherService;
import com.theschool.service.TeacherServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "studentService") // singleton scope by default
    public StudentService getStudentService() {
        StudentService service = new StudentServiceImpl();
        return service;
    }

    @Bean(name = "teacherService")
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE) // set the scope to prototype
    public TeacherService getTeacherService() {
        TeacherService service = new TeacherServiceImpl();
        return service;
    }
}
