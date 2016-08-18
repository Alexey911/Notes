package com.zhytnik.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Alexey Zhytnik
 * @since 16.08.2016
 */
@SpringBootApplication
@EnableEurekaServer
public class NotesApp {
    public static void main(String... args) {
        SpringApplication.run(NotesApp.class, args);
    }
}
