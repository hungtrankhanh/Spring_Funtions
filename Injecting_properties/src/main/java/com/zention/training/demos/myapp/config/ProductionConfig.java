package com.zention.training.demos.myapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Profile("prod")
@Configuration
@ComponentScan(basePackages = "com.zention.training.demos.myapp")
@PropertySource("classpath:application-prod.properties")
public class ProductionConfig {

}
