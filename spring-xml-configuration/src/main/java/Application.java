import com.theschool.service.StudentService;
import com.theschool.service.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // loading the configuration into spring application context
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // getting a bean from the application context
        StudentService service = appContext.getBean("studentService", StudentServiceImpl.class);
        List<String> students = service.findAll();
        System.out.println("students:" + students);
    }
}
