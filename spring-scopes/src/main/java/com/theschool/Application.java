package com.theschool;

import com.theschool.service.StudentService;
import com.theschool.service.TeacherService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // getting a student service
        StudentService studentService1 = appContext.getBean("studentService", StudentService.class);
        System.out.println("studentService bean: " + studentService1);

        // getting again student service
        StudentService studentService2 = appContext.getBean("studentService", StudentService.class);
        System.out.println("studentService bean: " + studentService2); // same object

        // getting a teacher service
        TeacherService teacherService1 = appContext.getBean("teacherService", TeacherService.class);
        System.out.println("teacherService bean: " + teacherService1);

        // getting again teacher service
        TeacherService teacherService2 = appContext.getBean("teacherService", TeacherService.class);
        System.out.println("teacherService bean: " + teacherService2); // different object
    }
}
