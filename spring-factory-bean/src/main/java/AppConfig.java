import com.theschool.util.StudentFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "student")
    public StudentFactory getStudentFactory() {
        StudentFactory studentFactory = new StudentFactory();
        studentFactory.setSchool("The School"); // setting the same school for every student
        return studentFactory;
    }
}
