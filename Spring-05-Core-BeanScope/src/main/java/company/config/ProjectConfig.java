package company.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com")
@ComponentScan(basePackages = {"company.proxy","company.repository","company.service"})
public class ProjectConfig {
}
