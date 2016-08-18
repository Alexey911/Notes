package com.zhytnik.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Alexey Zhytnik
 * @since 16.08.2016
 */
@SpringBootApplication
@EnableConfigServer
public class Configuration {
    public static void main(String... args) {
        SpringApplication.run(Configuration.class, args);
    }
}
