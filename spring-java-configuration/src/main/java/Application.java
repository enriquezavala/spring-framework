import com.theschool.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // loading the configuration into spring application context
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        // getting a bean from the application context
        StudentService service = appContext.getBean("studentService", StudentService.class);
        List<String> students = service.findAll();
        System.out.println("student:" + students);
    }
}
