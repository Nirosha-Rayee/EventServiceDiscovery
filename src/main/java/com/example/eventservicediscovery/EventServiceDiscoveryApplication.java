package com.example.eventservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EventServiceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventServiceDiscoveryApplication.class, args);
    }

}
