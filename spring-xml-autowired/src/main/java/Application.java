import com.theschool.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentService studentService = appContext.getBean("studentService", StudentServiceImpl.class);
        List<String> students = studentService.findAll();
        System.out.println("students:" + students);

        TeacherService teacherService = appContext.getBean("teacherService", TeacherServiceImpl.class);
        List<String> teachers = teacherService.findAll();
        System.out.println("teacher:" + teachers);

        SubjectService subjectService = appContext.getBean("subjectService", SubjectServiceImpl.class);
        List<String> subjects = subjectService.findAll();
        System.out.println("subjects:" + subjects);
    }
}
