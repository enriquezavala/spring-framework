import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.theschool") // with component scan, AppConfig don't need to configure the beans manually
public class AppConfig {
}
