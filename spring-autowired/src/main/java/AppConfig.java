import com.theschool.repository.*;
import com.theschool.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "studentService")
    public StudentService getStudentService() {
        return new StudentServiceImpl();
    }

    @Bean(name = "studentRepository")
    public StudentRepository getStudentRepository() {
        return new StudentRepositoryImpl();
    }

    @Bean(name = "teacherService")
    public TeacherService getTeacherService() {
        return new TeacherServiceImpl(new TeacherRepositoryImpl());
    }

    @Bean(name = "subjectService")
    public SubjectService getSubjectService() {
        return new SubjectServiceImpl();
    }

    @Bean(name = "subjectRepository")
    public SubjectRepository getSubjectRepository() {
        return new SubjectRepositoryImpl();
    }
}
