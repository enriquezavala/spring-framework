import com.theschool.service.StudentService;
import com.theschool.service.StudentServiceImpl;
import com.theschool.repository.StudentRepository;
import com.theschool.repository.StudentRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// start the application configuration
@Configuration // instead of applicationContext.xml
public class AppConfig {

    @Bean(name = "studentService") // indicates that a method produces a bean to be managed by the spring container
    public StudentService getStudentService() {
        // injecting the repository into the service, using constructor injection
        StudentServiceImpl service = new StudentServiceImpl(getStudentRepository());
        return service;
    }

    @Bean(name = "studentRepository")
    public StudentRepository getStudentRepository() {
        return new StudentRepositoryImpl();
    }
}
