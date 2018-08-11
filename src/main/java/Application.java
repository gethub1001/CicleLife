import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class Application extends SpringBootServletInitializer {
  public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

  /*  @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.so.configure(builder);
    }*/
}
