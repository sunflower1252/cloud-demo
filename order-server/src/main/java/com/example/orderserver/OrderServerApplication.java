package com.example.orderserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author YG
 */
@EnableFeignClients
@EnableEurekaServer
@SpringBootApplication
@MapperScan("com.example.orderserver.mapper")
public class OrderServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServerApplication.class, args);
        System.out.println(
                "                _                                               \n" +
                        "               | |                                              \n" +
                        "   ___  _ __ __| | ___ _ __ ______ ___  ___ _ ____   _____ _ __ \n" +
                        "  / _ \\| '__/ _` |/ _ \\ '__|______/ __|/ _ \\ '__\\ \\ / / _ \\ '__|\n" +
                        " | (_) | | | (_| |  __/ |         \\__ \\  __/ |   \\ V /  __/ |   \n" +
                        "  \\___/|_|  \\__,_|\\___|_|         |___/\\___|_|    \\_/ \\___|_|   \n");
    }

}
