package com.zhytnik.notes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Alexey Zhytnik
 * @since 17.08.2016
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NotesService {
    public static void main(String... args) {
        SpringApplication.run(NotesService.class, args);
    }
}
