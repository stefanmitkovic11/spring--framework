package company.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@Configuration
//@ComponentScan(basePackages = "com")
@ComponentScan(basePackages = {"company.proxy","company.repository","company.service"})
public class ProjectConfig {
}
