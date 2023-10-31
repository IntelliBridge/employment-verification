package demo.empverification;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@ComponentScan(basePackages = {"demo.empverification"})
@EntityScan(basePackages = {"demo.empverification"})
@EnableJpaRepositories(basePackages = {"demo.empverification"})
@SpringBootApplication(
		exclude = {
				// This is here to disabling the Spring Security login form
				SecurityAutoConfiguration.class
		})
public class EmploymentVerificationApplication extends SpringBootServletInitializer
{
	public static void main(String[] args) {
		SpringApplication.run(EmploymentVerificationApplication.class, args);
	}
}
