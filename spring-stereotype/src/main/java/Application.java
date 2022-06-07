import com.theschool.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@ComponentScan("com.theschool")
public class Application {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(Application.class);
        StudentService studentService = appContext.getBean("studentServiceImpl", StudentService.class);
        List<String> students = studentService.findAll();
        System.out.println("student:" + students);
    }
}
