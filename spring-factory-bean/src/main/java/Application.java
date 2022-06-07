import com.theschool.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = appContext.getBean("student", Student.class);
        student.setName("Lovell");
        System.out.println("student:" + student);
    }
}
