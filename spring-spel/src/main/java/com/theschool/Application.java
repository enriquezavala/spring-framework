package com.theschool;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;

public class Application {
    private static LocalDate date;

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Application.class);
        System.out.println("date:" + date);
    }

    // using SpEL to get actual date from LocalDate object
    @Value("#{T(java.time.LocalDate).now()}")
    public void setDate(LocalDate now) {
        date = now;
    }
}
