package com.github.ipan97.discovery.svc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoverySVCApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoverySVCApplication.class, args);
    }
}
