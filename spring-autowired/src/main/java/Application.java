import com.theschool.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        StudentService studentService = appContext.getBean("studentService", StudentService.class);
        List<String> students = studentService.findAll();
        System.out.println("student:" + students);

        TeacherService teacherService = appContext.getBean("teacherService", TeacherServiceImpl.class);
        List<String> teachers = teacherService.findAll();
        System.out.println("teachers:" + teachers);

        SubjectService subjectService = appContext.getBean("subjectService", SubjectServiceImpl.class);
        List<String> subjects = subjectService.findAll();
        System.out.println("subjects:" + subjects);
    }
}
