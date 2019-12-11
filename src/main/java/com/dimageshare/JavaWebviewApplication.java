package com.dimageshare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author bac-ta
 */
@SpringBootApplication
@EnableJpaAuditing
public class JavaWebviewApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(JavaWebviewApplication.class, args);
    }
}
