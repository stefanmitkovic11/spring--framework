package company.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@Configuration
//@ComponentScan(basePackages = "com")
@ComponentScan(basePackages = {"com.proxy","com.repository","com.service"})
public class ProjectConfig {
}
