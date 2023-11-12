package company.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com")
@ComponentScan(basePackages = {"com.proxy","com.repository","com.service"})
public class ProjectConfig {
}
