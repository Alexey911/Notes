package com.zhytnik.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Alexey Zhytnik
 * @since 17.08.2016
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class Gateway {
    public static void main(String... args) {
        SpringApplication.run(Gateway.class, args);
    }
}
