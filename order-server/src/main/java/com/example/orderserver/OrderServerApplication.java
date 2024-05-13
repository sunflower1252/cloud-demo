package com.example.orderserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author YG
 */
@EnableEurekaServer
@SpringBootApplication
@MapperScan("com.example.orderserver.mapper")
public class OrderServerApplication {

    public static void main(String[] args) {
        System.out.println("orderserver启动成功");
        SpringApplication.run(OrderServerApplication.class, args);
    }

}
