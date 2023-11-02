package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@Configuration
//@ComponentScan(basePackages = "com")
@ComponentScan(basePackages = {"com.proxy","com.model","com.repository","com.service"})
public class ProjectConfig {
}
