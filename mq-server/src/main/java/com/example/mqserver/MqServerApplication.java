package com.example.mqserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author YG
 */
@SpringBootApplication
@EnableEurekaServer
public class MqServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqServerApplication.class, args);
    }

}
