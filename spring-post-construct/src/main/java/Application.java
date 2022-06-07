import com.theschool.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;

@ComponentScan("com.theschool")
public class Application {

    @Autowired
    private StudentService studentService;

    public Application() {
        System.out.println("running application constructor");
    }

    @PostConstruct // method runs after constructor and dependency injection are done
    private void init() {
        System.out.println("running init method after constructor and dependency injection");
    }

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Application.class);
    }
}
