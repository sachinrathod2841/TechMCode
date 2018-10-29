package com.technical.hello.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@Configuration
@EnableAutoConfiguration
@EnableWebMvc
@PropertySource(value = { "file:/opt/secrets/secrets.properties"}, ignoreResourceNotFound = true)
@ComponentScan(basePackages = {"com.technical.hello"})
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
