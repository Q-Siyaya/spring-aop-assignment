package com.springaop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.springaop.implementation","com.springaop.services"
,"com.springaop.aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
